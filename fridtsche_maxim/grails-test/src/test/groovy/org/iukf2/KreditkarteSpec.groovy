package org.iukf2

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class KreditkarteSpec extends Specification implements DomainUnitTest<Kreditkarte> {

     void "test domain constraints"() {
        when:
        Kreditkarte domain = new Kreditkarte()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
