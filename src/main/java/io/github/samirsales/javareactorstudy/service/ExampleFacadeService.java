package io.github.samirsales.javareactorstudy.service;

import io.github.samirsales.javareactorstudy.domain.Person;
import io.github.samirsales.javareactorstudy.domain.PersonsKeeper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ExampleFacadeService {

    public Mono<Person> getPerson(Long id){
        PersonsKeeper personsKeeper = new PersonsKeeper();
        List<Person> people = personsKeeper.getPersons();
        Person person = null;

        for(Person p : people){
            if(p.getId().equals(id)){
                person = p;
                break;
            }
        }

        return person != null ? Mono.just(person) : null;
    }

    public Mono<List<Person>> getPersons(){
        PersonsKeeper personsKeeper = new PersonsKeeper();
        return Mono.just(personsKeeper.getPersons());
    }

    public Flux<Person> getPersonsWithFlux(){
        PersonsKeeper personsKeeper = new PersonsKeeper();
        return Flux.fromIterable(personsKeeper.getPersons());
    }


}
