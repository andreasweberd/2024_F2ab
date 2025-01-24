package org.iukf2

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class CreditCardAccountSpec extends Specification implements DomainUnitTest<CreditCardAccount> {

     void "test domain constraints"() {
        when:
        CreditCardAccount domain = new CreditCardAccount()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
