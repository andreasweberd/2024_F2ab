package org.iukf2

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class SignInSignUpControllerSpec extends Specification implements ControllerUnitTest<SignInSignUpController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
