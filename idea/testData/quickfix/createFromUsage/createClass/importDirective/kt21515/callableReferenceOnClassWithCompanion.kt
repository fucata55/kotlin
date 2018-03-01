// "Add explicit import" "true"

open class Bar {
    companion object {
        class FromBarCompanion {
            fun foo() = 42

            // We need it to cover another code-path
            companion object { }
        }
    }
}

class Foo : Bar() {
    val a = <caret>FromBarCompanion::foo
}