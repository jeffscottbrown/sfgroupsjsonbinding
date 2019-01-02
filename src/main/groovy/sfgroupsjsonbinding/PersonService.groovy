package sfgroupsjsonbinding

import grails.gorm.services.Service

@Service(Person)
interface PersonService {
    List<Person> list()
    Person save(Person p)
    Person get(long id)
}
