package org.iukf2

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class OwnerSpec extends Specification implements DomainUnitTest<Owner> {

     void "test domain constraints"() {
        when:
        Owner domain = new Owner()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
