package io.github.samirsales.javareactorstudy.controller;

import io.github.samirsales.javareactorstudy.domain.Animal;
import io.github.samirsales.javareactorstudy.domain.Person;
import io.github.samirsales.javareactorstudy.service.ExampleFacadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@RestController
@RequestMapping("/test")
public class ExampleController {

    @Autowired
    private ExampleFacadeService facadeService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public DeferredResult<?> getPerson(@PathVariable("id") long id){

        DeferredResult<HttpEntity<?>> response = new DeferredResult<>();

        Consumer<Person> onSuccess = personResult -> response
                .setResult(new ResponseEntity<>(personResult, HttpStatus.OK));

        Consumer<Throwable> onError = throwable -> {
            System.out.println("Failed to catch person. [id="+id+"]");
            response.setResult(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
        };

        try {
            this.facadeService.getPerson(id).subscribe(onSuccess, onError);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }

        return response;
    }

    @RequestMapping(value = "/animals/{personId}", method = RequestMethod.GET)
    public Mono<List<Animal>> getAnimalsOfPerson(@PathVariable("personId") Long personId){
        return facadeService.getAnimalsOfPerson(personId);
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
