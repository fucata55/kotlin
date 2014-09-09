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

package org.jetbrains.jet.codegen;

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
@TestMetadata("compiler/testData/codegen/topLevelMemberInvocation")
@TestDataPath("$PROJECT_ROOT")
@RunWith(org.jetbrains.jet.JUnit3RunnerWithInners.class)
public class TopLevelMembersInvocationTestGenerated extends AbstractTopLevelMembersInvocationTest {
    public void testAllFilesPresentInTopLevelMemberInvocation() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/topLevelMemberInvocation"), Pattern.compile("^([^\\.]+)$"), false);
    }
    
    @TestMetadata("extensionFunction")
    public void testExtensionFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/topLevelMemberInvocation/extensionFunction/");
        doTest(fileName);
    }
    
    @TestMetadata("functionDifferentPackage")
    public void testFunctionDifferentPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/topLevelMemberInvocation/functionDifferentPackage/");
        doTest(fileName);
    }
    
    @TestMetadata("functionInMultiFilePackage")
    public void testFunctionInMultiFilePackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/topLevelMemberInvocation/functionInMultiFilePackage/");
        doTest(fileName);
    }
    
    @TestMetadata("functionSamePackage")
    public void testFunctionSamePackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/topLevelMemberInvocation/functionSamePackage/");
        doTest(fileName);
    }
    
    @TestMetadata("property")
    public void testProperty() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/topLevelMemberInvocation/property/");
        doTest(fileName);
    }
    
    @TestMetadata("propertyWithGetter")
    public void testPropertyWithGetter() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/topLevelMemberInvocation/propertyWithGetter/");
        doTest(fileName);
    }
    
    @TestMetadata("twoModules")
    public void testTwoModules() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/codegen/topLevelMemberInvocation/twoModules/");
        doTest(fileName);
    }
    
}
