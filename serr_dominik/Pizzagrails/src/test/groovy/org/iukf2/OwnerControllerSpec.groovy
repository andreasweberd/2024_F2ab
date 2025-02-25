package org.iukf2

import grails.testing.gorm.DomainUnitTest
import grails.testing.web.controllers.ControllerUnitTest
import grails.validation.ValidationException
import spock.lang.*

class OwnerControllerSpec extends Specification implements ControllerUnitTest<OwnerController>, DomainUnitTest<Owner> {

    def populateValidParams(params) {
        assert params != null

        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
        assert false, "TODO: Provide a populateValidParams() implementation for this generated test suite"
    }

    void "Test the index action returns the correct model"() {
        given:
        controller.ownerService = Mock(OwnerService) {
            1 * list(_) >> []
            1 * count() >> 0
        }

        when:"The index action is executed"
        controller.index()

        then:"The model is correct"
        !model.inhaberList
        model.inhaberCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
        controller.create()

        then:"The model is correctly created"
        model.inhaber!= null
    }

    void "Test the save action with a null instance"() {
        when:"Save is called for a domain instance that doesn't exist"
        request.contentType = FORM_CONTENT_TYPE
        request.method = 'POST'
        controller.save(null)

        then:"A 404 error is returned"
        response.redirectedUrl == '/inhaber/index'
        flash.message != null
    }

    void "Test the save action correctly persists"() {
        given:
        controller.ownerService = Mock(OwnerService) {
            1 * save(_ as Owner)
        }

        when:"The save action is executed with a valid instance"
        response.reset()
        request.contentType = FORM_CONTENT_TYPE
        request.method = 'POST'
        populateValidParams(params)
        def inhaber = new Owner(params)
        inhaber.id = 1

        controller.save(inhaber)

        then:"A redirect is issued to the show action"
        response.redirectedUrl == '/inhaber/show/1'
        controller.flash.message != null
    }

    void "Test the save action with an invalid instance"() {
        given:
        controller.ownerService = Mock(OwnerService) {
            1 * save(_ as Owner) >> { Owner inhaber ->
                throw new ValidationException("Invalid instance", inhaber.errors)
            }
        }

        when:"The save action is executed with an invalid instance"
        request.contentType = FORM_CONTENT_TYPE
        request.method = 'POST'
        def inhaber = new Owner()
        controller.save(inhaber)

        then:"The create view is rendered again with the correct model"
        model.inhaber != null
        view == 'create'
    }

    void "Test the show action with a null id"() {
        given:
        controller.ownerService = Mock(OwnerService) {
            1 * get(null) >> null
        }

        when:"The show action is executed with a null domain"
        controller.show(null)

        then:"A 404 error is returned"
        response.status == 404
    }

    void "Test the show action with a valid id"() {
        given:
        controller.ownerService = Mock(OwnerService) {
            1 * get(2) >> new Owner()
        }

        when:"A domain instance is passed to the show action"
        controller.show(2)

        then:"A model is populated containing the domain instance"
        model.inhaber instanceof Owner
    }

    void "Test the edit action with a null id"() {
        given:
        controller.ownerService = Mock(OwnerService) {
            1 * get(null) >> null
        }

        when:"The show action is executed with a null domain"
        controller.edit(null)

        then:"A 404 error is returned"
        response.status == 404
    }

    void "Test the edit action with a valid id"() {
        given:
        controller.ownerService = Mock(OwnerService) {
            1 * get(2) >> new Owner()
        }

        when:"A domain instance is passed to the show action"
        controller.edit(2)

        then:"A model is populated containing the domain instance"
        model.inhaber instanceof Owner
    }


    void "Test the update action with a null instance"() {
        when:"Save is called for a domain instance that doesn't exist"
        request.contentType = FORM_CONTENT_TYPE
        request.method = 'PUT'
        controller.update(null)

        then:"A 404 error is returned"
        response.redirectedUrl == '/inhaber/index'
        flash.message != null
    }

    void "Test the update action correctly persists"() {
        given:
        controller.ownerService = Mock(OwnerService) {
            1 * save(_ as Owner)
        }

        when:"The save action is executed with a valid instance"
        response.reset()
        request.contentType = FORM_CONTENT_TYPE
        request.method = 'PUT'
        populateValidParams(params)
        def inhaber = new Owner(params)
        inhaber.id = 1

        controller.update(inhaber)

        then:"A redirect is issued to the show action"
        response.redirectedUrl == '/inhaber/show/1'
        controller.flash.message != null
    }

    void "Test the update action with an invalid instance"() {
        given:
        controller.ownerService = Mock(OwnerService) {
            1 * save(_ as Owner) >> { Owner inhaber ->
                throw new ValidationException("Invalid instance", inhaber.errors)
            }
        }

        when:"The save action is executed with an invalid instance"
        request.contentType = FORM_CONTENT_TYPE
        request.method = 'PUT'
        controller.update(new Owner())

        then:"The edit view is rendered again with the correct model"
        model.inhaber != null
        view == 'edit'
    }

    void "Test the delete action with a null instance"() {
        when:"The delete action is called for a null instance"
        request.contentType = FORM_CONTENT_TYPE
        request.method = 'DELETE'
        controller.delete(null)

        then:"A 404 is returned"
        response.redirectedUrl == '/inhaber/index'
        flash.message != null
    }

    void "Test the delete action with an instance"() {
        given:
        controller.ownerService = Mock(OwnerService) {
            1 * delete(2)
        }

        when:"The domain instance is passed to the delete action"
        request.contentType = FORM_CONTENT_TYPE
        request.method = 'DELETE'
        controller.delete(2)

        then:"The user is redirected to index"
        response.redirectedUrl == '/inhaber/index'
        flash.message != null
    }
}






