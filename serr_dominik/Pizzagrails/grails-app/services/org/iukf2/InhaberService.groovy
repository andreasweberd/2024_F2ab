package org.iukf2

import grails.gorm.services.Service

@Service(Inhaber)
interface InhaberService {

    Inhaber get(Serializable id)

    List<Inhaber> list(Map args)

    Long count()

    void delete(Serializable id)

    Inhaber save(Inhaber inhaber)

}