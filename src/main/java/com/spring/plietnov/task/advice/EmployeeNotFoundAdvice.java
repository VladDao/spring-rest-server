package com.spring.plietnov.task.advice;

import com.spring.plietnov.task.exception.EmployeeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class EmployeeNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundAdvice(EmployeeNotFoundException ex) {
        return ex.getMessage();
    }
}
