package org.iukf2

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class KreditkartenkontoController {

    KreditkartenkontoService kreditkartenkontoService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond kreditkartenkontoService.list(params), model:[kreditkartenkontoCount: kreditkartenkontoService.count()]
    }

    def show(Long id) {
        respond kreditkartenkontoService.get(id)
    }

    def create() {
        respond new Kreditkartenkonto(params)
    }

    def save(Kreditkartenkonto kreditkartenkonto) {
        if (kreditkartenkonto == null) {
            notFound()
            return
        }

        try {
            kreditkartenkontoService.save(kreditkartenkonto)
        } catch (ValidationException e) {
            respond kreditkartenkonto.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'kreditkartenkonto.label', default: 'Kreditkartenkonto'), kreditkartenkonto.id])
                redirect kreditkartenkonto
            }
            '*' { respond kreditkartenkonto, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond kreditkartenkontoService.get(id)
    }

    def update(Kreditkartenkonto kreditkartenkonto) {
        if (kreditkartenkonto == null) {
            notFound()
            return
        }

        try {
            kreditkartenkontoService.save(kreditkartenkonto)
        } catch (ValidationException e) {
            respond kreditkartenkonto.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'kreditkartenkonto.label', default: 'Kreditkartenkonto'), kreditkartenkonto.id])
                redirect kreditkartenkonto
            }
            '*'{ respond kreditkartenkonto, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        kreditkartenkontoService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'kreditkartenkonto.label', default: 'Kreditkartenkonto'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'kreditkartenkonto.label', default: 'Kreditkartenkonto'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
