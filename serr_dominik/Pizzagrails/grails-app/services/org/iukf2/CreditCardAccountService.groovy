package org.iukf2

import grails.gorm.services.Service

@Service(CreditCardAccount)
interface CreditCardAccountService {

    CreditCardAccount get(Serializable id)

    List<CreditCardAccount> list(Map args)

    Long count()

    void delete(Serializable id)

    CreditCardAccount save(CreditCardAccount creditCardAccount)

}