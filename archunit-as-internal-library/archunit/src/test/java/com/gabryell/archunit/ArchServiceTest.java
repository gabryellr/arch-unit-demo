package com.gabryell.archunit;

import com.gabryell.archvalidationlib.ArchValidationTest;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchTests;

@AnalyzeClasses(packages = "com.gabryell.archunit")
public class ArchServiceTest {

    @ArchTest
    static final ArchTests includedRules1 = ArchTests.in(ArchValidationTest.class);

}
