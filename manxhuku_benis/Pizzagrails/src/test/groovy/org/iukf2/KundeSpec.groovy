package org.iukf2

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class KundeSpec extends Specification implements DomainUnitTest<Kunde> {

     void "test domain constraints"() {
        when:
        Kunde domain = new Kunde()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
