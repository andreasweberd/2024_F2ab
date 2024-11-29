package Org

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class Iukf2KreditkarteSpec extends Specification implements DomainUnitTest<Iukf2Kreditkarte> {

     void "test domain constraints"() {
        when:
        Iukf2Kreditkarte domain = new Iukf2Kreditkarte()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
