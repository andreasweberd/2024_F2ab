package org.iukf2

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class CreditCardAccountController {

    CreditCardAccountService creditCardAccountService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond creditCardAccountService.list(params), model:[creditCardnkontoCount: creditCardAccountService.count()]
    }

    def show(Long id) {
        respond creditCardAccountService.get(id)
    }

    def create() {
        respond new CreditCardAccount(params)
    }

    def save(CreditCardAccount creditCardAccount) {
        if (creditCardAccount == null) {
            notFound()
            return
        }

        try {
            creditCardAccountService.save(creditCardAccount)
        } catch (ValidationException e) {
            respond creditCardAccount.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'creditCardAccount.label', default: 'creditCardAccount'), creditCardAccount.id])
                redirect creditCardAccount
            }
            '*' { respond creditCardAccount, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond creditCardAccountService.get(id)
    }

    def update(CreditCardAccount creditCardAccount) {
        if (creditCardAccount == null) {
            notFound()
            return
        }

        try {
            creditCardAccountService.save(creditCardAccount)
        } catch (ValidationException e) {
            respond creditCardAccount.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'creditCardAccount.label', default: 'creditCardAccount'), creditCardAccount.id])
                redirect creditCardAccount
            }
            '*'{ respond creditCardAccount, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        creditCardAccountService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'creditCardAccount.label', default: 'creditCardAccount'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'creditCardAccount.label', default: 'creditCardAccount'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
