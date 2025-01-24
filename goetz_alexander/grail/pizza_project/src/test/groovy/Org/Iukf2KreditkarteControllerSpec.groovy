package Org

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class Iukf2KreditkarteControllerSpec extends Specification implements ControllerUnitTest<Iukf2KreditkarteController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
