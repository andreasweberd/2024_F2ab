package org.iukf2

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class CreditCardSpec extends Specification implements DomainUnitTest<CreditCard> {

     void "test domain constraints"() {
        when:
        CreditCard domain = new CreditCard()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
