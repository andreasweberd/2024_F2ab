package org.iukf2

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ZahlungController {

    ZahlungService zahlungService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond zahlungService.list(params), model:[zahlungCount: zahlungService.count()]
    }

    def show(Long id) {
        respond zahlungService.get(id)
    }

    def create() {
        respond new Zahlung(params)
    }

    def save(Zahlung zahlung) {
        if (zahlung == null) {
            notFound()
            return
        }

        try {
            zahlungService.save(zahlung)
        } catch (ValidationException e) {
            respond zahlung.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'zahlung.label', default: 'Zahlung'), zahlung.id])
                redirect zahlung
            }
            '*' { respond zahlung, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond zahlungService.get(id)
    }

    def update(Zahlung zahlung) {
        if (zahlung == null) {
            notFound()
            return
        }

        try {
            zahlungService.save(zahlung)
        } catch (ValidationException e) {
            respond zahlung.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'zahlung.label', default: 'Zahlung'), zahlung.id])
                redirect zahlung
            }
            '*'{ respond zahlung, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        zahlungService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'zahlung.label', default: 'Zahlung'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'zahlung.label', default: 'Zahlung'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
