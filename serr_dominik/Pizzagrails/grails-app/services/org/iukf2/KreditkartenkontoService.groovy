package org.iukf2

import grails.gorm.services.Service

@Service(Kreditkartenkonto)
interface KreditkartenkontoService {

    Kreditkartenkonto get(Serializable id)

    List<Kreditkartenkonto> list(Map args)

    Long count()

    void delete(Serializable id)

    Kreditkartenkonto save(Kreditkartenkonto kreditkartenkonto)

}