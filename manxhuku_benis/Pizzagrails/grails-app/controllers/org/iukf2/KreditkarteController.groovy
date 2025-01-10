package org.iukf2

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class KreditkarteController {

    KreditkarteService kreditkarteService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond kreditkarteService.list(params), model:[kreditkarteCount: kreditkarteService.count()]
    }

    def show(Long id) {
        respond kreditkarteService.get(id)
    }

    def create() {
        respond new Kreditkarte(params)
    }

    def save(Kreditkarte kreditkarte) {
        if (kreditkarte == null) {
            notFound()
            return
        }

        try {
            kreditkarteService.save(kreditkarte)
        } catch (ValidationException e) {
            respond kreditkarte.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'kreditkarte.label', default: 'Kreditkarte'), kreditkarte.id])
                redirect kreditkarte
            }
            '*' { respond kreditkarte, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond kreditkarteService.get(id)
    }

    def update(Kreditkarte kreditkarte) {
        if (kreditkarte == null) {
            notFound()
            return
        }

        try {
            kreditkarteService.save(kreditkarte)
        } catch (ValidationException e) {
            respond kreditkarte.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'kreditkarte.label', default: 'Kreditkarte'), kreditkarte.id])
                redirect kreditkarte
            }
            '*'{ respond kreditkarte, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        kreditkarteService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'kreditkarte.label', default: 'Kreditkarte'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'kreditkarte.label', default: 'Kreditkarte'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
