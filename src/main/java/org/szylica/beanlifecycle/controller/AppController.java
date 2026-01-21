package org.szylica.beanlifecycle.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.*;
import org.szylica.beanlifecycle.LibraryManager;
import org.szylica.beanlifecycle.model.NumberDto;
import org.szylica.beanlifecycle.event.CalculatorEvent;
import org.szylica.beanlifecycle.model.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


@RestController
public class AppController implements ApplicationEventPublisherAware {

    private final ApplicationContext context;

    public AppController(ApplicationContext context) {
        this.context = context;
    }

    private ApplicationEventPublisher publisher;

    @GetMapping("/bean")
    public void createBean(){


        LibraryManager libraryManager = context.getBean(LibraryManager.class);


    }

    @PostMapping("/calc")
    public void calc(@RequestBody NumberDto numberDto){
        publisher.publishEvent(new CalculatorEvent(
                this,
                numberDto.getFirstNumber(),
                numberDto.getSecondNumber()));
    }

    @PostMapping("/create-students")
    public void createStudents(@RequestParam(defaultValue = "20") int numberOfStudents,@RequestParam(defaultValue = "10") int indexLength) throws NoSuchFieldException, IllegalAccessException {
        Student[] students = new Student[numberOfStudents];

        Map<Integer, String> map = new HashMap<>();
        for(int i = 0; i < numberOfStudents; i++){
            students[i] = new Student(indexLength);

            var field = students[i].getClass().getDeclaredField("indexNumber");
            field.setAccessible(true);
            var index = (String)field.get(students[i]);

            map.put(students[i].hashCode(), index);
        }

        System.out.println(map);

    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
