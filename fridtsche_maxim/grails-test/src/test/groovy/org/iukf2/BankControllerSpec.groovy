package org.iukf2

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class BankControllerSpec extends Specification implements ControllerUnitTest<BankController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
