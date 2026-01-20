package org.szylica.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {

    private final ApplicationContext context;

    public AppController(ApplicationContext context) {
        this.context = context;
    }

    @GetMapping("/bean")
    public void createBean(){


        LibraryManager libraryManager = context.getBean(LibraryManager.class);


    }

    @PostMapping("/add")
    public void add(@RequestBody NumberDto numberDto){

    }

}
