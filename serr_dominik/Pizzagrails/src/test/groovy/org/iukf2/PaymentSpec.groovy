package org.iukf2

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PaymentSpec extends Specification implements DomainUnitTest<Payment> {

     void "test domain constraints"() {
        when:
        Payment domain = new Payment()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
