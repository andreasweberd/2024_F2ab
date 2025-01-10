package org.iukf2

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class KreditkartenkontoSpec extends Specification implements DomainUnitTest<Kreditkartenkonto> {

     void "test domain constraints"() {
        when:
        Kreditkartenkonto domain = new Kreditkartenkonto()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
