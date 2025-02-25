package org.iukf2

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class PaymentController {

    PaymentService paymentService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond paymentService.list(params), model:[paymentCount: paymentService.count()]
    }

    def show(Long id) {
        respond paymentService.get(id)
    }

    def create() {
        respond new Payment(params)
    }

    def save(Payment payment) {
        if (payment == null) {
            notFound()
            return
        }

        try {
            paymentService.save(payment)
        } catch (ValidationException e) {
            respond payment.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'payment.label', default: 'payment'), payment.id])
                redirect payment
            }
            '*' { respond payment, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond paymentService.get(id)
    }

    def update(Payment payment) {
        if (payment == null) {
            notFound()
            return
        }

        try {
            paymentService.save(payment)
        } catch (ValidationException e) {
            respond payment.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'payment.label', default: 'payment'), payment.id])
                redirect payment
            }
            '*'{ respond payment, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        paymentService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'payment.label', default: 'payment'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'payment.label', default: 'payment'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
