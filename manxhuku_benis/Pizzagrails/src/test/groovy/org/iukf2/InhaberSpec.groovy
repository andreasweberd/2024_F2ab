package org.iukf2

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class InhaberSpec extends Specification implements DomainUnitTest<Inhaber> {

     void "test domain constraints"() {
        when:
        Inhaber domain = new Inhaber()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
