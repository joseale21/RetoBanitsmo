# Autor: Jose Alejandro Santamaria Fuentes

  @stories
  Feature: retoBanitsmo
    As a web user, I want read the PJ-Autocertificación unificado- Fatca y CRS pdf document
    @scenario1
Scenario: Read a specific PDF document on the banitsmo website
      Given that Dante wants read a specific pdf documents he enters the Banitsmo page
      When he searched for the pdf document and read it
      Then he verified that it is PJ+Autocertificacion+unificado pdf document

    @scenario2
    Scenario: Download a specific PDF document on the Banistmo page
      Given that Dante wants download a specific pdf documents he enters the Banitsmo page
      When he searched for the pdf document and downloaded it
      Then verified that it is MOMENTOS+DE+BIENESTAR pdf document