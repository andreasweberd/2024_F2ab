package org.iukf2

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class CreditCardHandlingControllerSpec extends Specification implements ControllerUnitTest<CreditCardHandlingController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
