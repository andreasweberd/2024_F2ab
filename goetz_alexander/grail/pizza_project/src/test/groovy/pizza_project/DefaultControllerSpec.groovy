package pizza_project

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class DefaultControllerSpec extends Specification implements ControllerUnitTest<DefaultController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
