package org.iukf2

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class KreditkarteControllerSpec extends Specification implements ControllerUnitTest<KreditkarteController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
