package org.iukf2

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class CustomerSpec extends Specification implements DomainUnitTest<Customer> {

     void "test domain constraints"() {
        when:
        Customer domain = new Customer()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
