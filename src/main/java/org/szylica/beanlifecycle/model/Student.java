package org.szylica.beanlifecycle.model;

import java.util.Random;

public class Student {

    private String indexNumber = "";

    public Student(int indexLength) {
        Random random = new Random();
        for(int i = 0; i < indexLength; i++){

            char letter = (char) ('A' + random.nextInt(26));
            indexNumber += letter;
        }

    }
}
