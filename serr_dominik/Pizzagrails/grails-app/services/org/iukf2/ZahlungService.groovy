package org.iukf2

import grails.gorm.services.Service

@Service(Zahlung)
interface ZahlungService {

    Zahlung get(Serializable id)

    List<Zahlung> list(Map args)

    Long count()

    void delete(Serializable id)

    Zahlung save(Zahlung zahlung)

}