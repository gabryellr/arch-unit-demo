package com.gabryell.archvalidationlib;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.syntax.elements.ClassesShouldConjunction;
import org.springframework.stereotype.Controller;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class ArchValidationTest {

    @ArchTest
    public void controllerClass_should_reside_controller_package(JavaClasses classes) {
        ClassesShouldConjunction rule = classes()
                .that()
                .areAnnotatedWith(Controller.class)
                .should()
                .resideInAPackage("..controller..");

        rule.check(classes);
    }
}