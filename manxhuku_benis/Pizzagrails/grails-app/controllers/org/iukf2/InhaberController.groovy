package org.iukf2

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class InhaberController {

    InhaberService inhaberService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond inhaberService.list(params), model:[inhaberCount: inhaberService.count()]
    }

    def show(Long id) {
        respond inhaberService.get(id)
    }

    def create() {
        respond new Inhaber(params)
    }

    def save(Inhaber inhaber) {
        if (inhaber == null) {
            notFound()
            return
        }

        try {
            inhaberService.save(inhaber)
        } catch (ValidationException e) {
            respond inhaber.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'inhaber.label', default: 'Inhaber'), inhaber.id])
                redirect inhaber
            }
            '*' { respond inhaber, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond inhaberService.get(id)
    }

    def update(Inhaber inhaber) {
        if (inhaber == null) {
            notFound()
            return
        }

        try {
            inhaberService.save(inhaber)
        } catch (ValidationException e) {
            respond inhaber.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'inhaber.label', default: 'Inhaber'), inhaber.id])
                redirect inhaber
            }
            '*'{ respond inhaber, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        inhaberService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'inhaber.label', default: 'Inhaber'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'inhaber.label', default: 'Inhaber'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
