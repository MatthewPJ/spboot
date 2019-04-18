package com.cargosmart.spboot.Student;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnWebApplication
public class StudentService {

    public String sayHello(){
        return "Hello Spring Boot!";
    }
}
