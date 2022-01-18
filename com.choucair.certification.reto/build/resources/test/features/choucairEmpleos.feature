@Regression
Feature: Choucair Jobs
    as an user i want to validate functionality of Jobs module.

    @Case1
    Scenario: Validate satisfactory access to Jobs portal
      Given than Jose want to access to Jobs portal
      When he clicks the Jobs button
      Then he should see an image showing Ven a probar el mundo con nosotros

    @Case2
    Scenario: Validate Choucair section visibility
      Given than Jose want to access to Jobs portal
      When he clicks the Jobs button
      Then he should see a section called "¿Qué es ser Choucair?"

    @Case3
    Scenario: Validate Prepare to apply section visibility
      Given than Jose want to access to Jobs portal
      When he clicks the Jobs button
      Then he should see the section called "Prepararse para aplicar"

    @Case4
    Scenario: Validate satisfactory access to link Que es ser Choucair
      Given than Jose want to access to Jobs portal
      When he clicks the Jobs button
      And click on link Que es ser Choucair
      Then he should see a section title called "Ser CHOUCAIR"

    @Case5
    Scenario: Validate satisfactory access to link Prepararse para aplicar
      Given than Jose want to access to Jobs portal
      When he clicks the Jobs button
      And click on link Prepararse para aplicar
      Then he should see the section title called "PREPARARSE PARA APLICAR"