package org.iukf2

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class OwnerServiceSpec extends Specification {

    OwnerService inhaberService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Inhaber(...).save(flush: true, failOnError: true)
        //new Inhaber(...).save(flush: true, failOnError: true)
        //Inhaber inhaber = new Inhaber(...).save(flush: true, failOnError: true)
        //new Inhaber(...).save(flush: true, failOnError: true)
        //new Inhaber(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //inhaber.id
    }

    void "test get"() {
        setupData()

        expect:
        inhaberService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Owner> inhaberList = inhaberService.list(max: 2, offset: 2)

        then:
        inhaberList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        inhaberService.count() == 5
    }

    void "test delete"() {
        Long inhaberId = setupData()

        expect:
        inhaberService.count() == 5

        when:
        inhaberService.delete(inhaberId)
        sessionFactory.currentSession.flush()

        then:
        inhaberService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Owner inhaber = new Owner()
        inhaberService.save(inhaber)

        then:
        inhaber.id != null
    }
}
