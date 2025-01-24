package org.iukf2

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class CreditCardController {

    CreditCardService creditCardService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond creditCardService.list(params), model:[creditCardCount: creditCardService.count()]
    }

    def show(Long id) {
        respond creditCardService.get(id)
    }

    def create() {
        respond new CreditCard(params)
    }

    def save(CreditCard creditCard) {
        if (creditCard == null) {
            notFound()
            return
        }

        try {
            creditCardService.save(creditCard)
        } catch (ValidationException e) {
            respond creditCard.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'creditCard.label', default: 'creditCard'), creditCard.id])
                redirect creditCard
            }
            '*' { respond creditCard, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond creditCardService.get(id)
    }

    def update(CreditCard creditCard) {
        if (creditCard == null) {
            notFound()
            return
        }

        try {
            creditCardService.save(creditCard)
        } catch (ValidationException e) {
            respond creditCard.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'creditCard.label', default: 'creditCard'), creditCard.id])
                redirect creditCard
            }
            '*'{ respond creditCard, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        creditCardService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'creditCard.label', default: 'creditCard'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'creditCard.label', default: 'creditCard'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
