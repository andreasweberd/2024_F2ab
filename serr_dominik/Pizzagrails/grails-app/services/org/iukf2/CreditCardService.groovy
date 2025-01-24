package org.iukf2

import grails.gorm.services.Service

@Service(CreditCard)
interface CreditCardService {

    CreditCard get(Serializable id)

    List<CreditCard> list(Map args)

    Long count()

    void delete(Serializable id)

    CreditCard save(CreditCard creditCard)

}