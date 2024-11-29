package Org

import org.iukf2.Kreditkarte

class Iukf2KreditkarteController {

    def index() {
        respond Kreditkarte.list()
    }

    def show(Long id) {
        respond Kreditkarte.get(id)
    }

    def create() {
        respond new Kreditkarte(params)
    }

    def save(Kreditkarte kreditkarte) {
        if (kreditkarte.save(flush: true)) {
            redirect action: "show", id: kreditkarte.id
        } else {
            render view: "create", model: [kreditkarte: kreditkarte]
        }
    }

    def edit(Long id) {
        respond Kreditkarte.get(id)
    }

    def update(Kreditkarte kreditkarte) {
        if (kreditkarte.save(flush: true)) {
            redirect action: "show", id: kreditkarte.id
        } else {
            render view: "edit", model: [kreditkarte: kreditkarte]
        }
    }

    def delete(Long id) {
        Kreditkarte kreditkarte = Kreditkarte.get(id)
        if (kreditkarte) {
            kreditkarte.delete(flush: true)
            redirect action: "index"
        } else {
            notFound()
        }
    }

    protected void notFound() {
        render status: 404, view: '/notFound'
    }
}