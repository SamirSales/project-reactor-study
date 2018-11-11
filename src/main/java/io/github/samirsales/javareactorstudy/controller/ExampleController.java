package io.github.samirsales.javareactorstudy.controller;

import io.github.samirsales.javareactorstudy.domain.Person;
import io.github.samirsales.javareactorstudy.service.ExampleFacadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/test")
public class ExampleController {

    @Autowired
    private ExampleFacadeService facadeService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Mono<Person> getPerson(@PathVariable("id") long id){
        return facadeService.getPerson(id);
    }


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Mono<List<Person>> getPersons(){
        return facadeService.getPersons();
    }

    @RequestMapping(value = "/all/flux", method = RequestMethod.GET)
    public Flux<Person> getPersonsWithFlux(){
        return facadeService.getPersonsWithFlux();
    }
}
