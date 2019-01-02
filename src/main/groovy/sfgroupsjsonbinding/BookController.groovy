package sfgroupsjsonbinding

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller('/book')
class BookController {

    private PersonService personService

    BookController(PersonService personService) {
        this.personService = personService
    }

    @Get('/')
    List<Person> list() {
        personService.list()
    }

    @Post('/')
    Person save(Person person) {
        personService.save person
    }

    @Get('/{id}')
    Person get(long id) {
        personService.get id
    }
}
