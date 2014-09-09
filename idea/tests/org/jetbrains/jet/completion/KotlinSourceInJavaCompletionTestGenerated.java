/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.completion;

import com.intellij.testFramework.TestDataPath;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;
import org.jetbrains.jet.JUnit3RunnerWithInners;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/completion/injava")
@TestDataPath("$PROJECT_ROOT")
@InnerTestClasses({})
@RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
public class KotlinSourceInJavaCompletionTestGenerated extends AbstractKotlinSourceInJavaCompletionTest {
    public void testAllFilesPresentInInjava() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/completion/injava"), Pattern.compile("^(.+)\\.java$"), true);
    }
    
    @TestMetadata("Class.java")
    public void testClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/injava/Class.java");
        doTest(fileName);
    }
    
    @TestMetadata("ClassMembers.java")
    public void testClassMembers() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/injava/ClassMembers.java");
        doTest(fileName);
    }
    
    @TestMetadata("ClassObject.java")
    public void testClassObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/injava/ClassObject.java");
        doTest(fileName);
    }
    
    @TestMetadata("ClassesFromNamespace.java")
    public void testClassesFromNamespace() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/injava/ClassesFromNamespace.java");
        doTest(fileName);
    }
    
    @TestMetadata("EnumConstants.java")
    public void testEnumConstants() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/injava/EnumConstants.java");
        doTest(fileName);
    }
    
    @TestMetadata("Nested.java")
    public void testNested() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/injava/Nested.java");
        doTest(fileName);
    }
    
    @TestMetadata("NestedObjectInstance.java")
    public void testNestedObjectInstance() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/injava/NestedObjectInstance.java");
        doTest(fileName);
    }
    
    @TestMetadata("ObjectInstance.java")
    public void testObjectInstance() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/injava/ObjectInstance.java");
        doTest(fileName);
    }
    
    @TestMetadata("Subpackage.java")
    public void testSubpackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/injava/Subpackage.java");
        doTest(fileName);
    }
    
    @TestMetadata("TopLevelMembers.java")
    public void testTopLevelMembers() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/injava/TopLevelMembers.java");
        doTest(fileName);
    }
    
    @TestMetadata("TraitMember.java")
    public void testTraitMember() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/completion/injava/TraitMember.java");
        doTest(fileName);
    }
    
}
