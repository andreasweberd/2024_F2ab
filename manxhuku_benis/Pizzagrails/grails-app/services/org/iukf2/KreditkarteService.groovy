package org.iukf2

import grails.gorm.services.Service

@Service(Kreditkarte)
interface KreditkarteService {

    Kreditkarte get(Serializable id)

    List<Kreditkarte> list(Map args)

    Long count()

    void delete(Serializable id)

    Kreditkarte save(Kreditkarte kreditkarte)

}