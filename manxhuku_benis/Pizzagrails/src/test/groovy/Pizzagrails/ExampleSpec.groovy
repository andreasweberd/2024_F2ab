package Pizzagrails

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ExampleSpec extends Specification implements DomainUnitTest<Example> {

     void "test domain constraints"() {
        when:
        Example domain = new Example()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
