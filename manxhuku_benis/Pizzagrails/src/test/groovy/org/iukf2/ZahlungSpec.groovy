package org.iukf2

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ZahlungSpec extends Specification implements DomainUnitTest<Zahlung> {

     void "test domain constraints"() {
        when:
        Zahlung domain = new Zahlung()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
