package io.github.samirsales.javareactorstudy.controller;

import io.github.samirsales.javareactorstudy.domain.Person;
import io.github.samirsales.javareactorstudy.service.ExampleFacadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class ExampleController {

    @Autowired
    private ExampleFacadeService facadeService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Person> getPersons(){
        return facadeService.getPersons();
    }
}
