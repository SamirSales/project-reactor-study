package io.github.samirsales.javareactorstudy.service;

import io.github.samirsales.javareactorstudy.domain.Person;
import io.github.samirsales.javareactorstudy.domain.PersonsKeeper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleFacadeService {

    public List<Person> getPersons(){
        PersonsKeeper personsKeeper = new PersonsKeeper();
        return personsKeeper.getPersons();
    }


}
