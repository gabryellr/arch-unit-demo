package com.gabryell.archunit;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.syntax.elements.ClassesShouldConjunction;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class ArchValidationTest {

    private static JavaClasses classes;

    @BeforeAll
    static void beforeAll() {
        classes = new ClassFileImporter()
                .importPackages("com.gabryell.archunit");
    }

    @Test
    public void controllerClass_should_reside_controller_package() {
        ClassesShouldConjunction rule = classes()
                .that()
                .areAnnotatedWith(Controller.class)
                .should()
                .resideInAPackage("..controller..");

        rule.check(classes);
    }
}
