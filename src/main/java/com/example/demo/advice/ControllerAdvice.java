package com.example.demo.advice;


//import com.example.demo.exception.DbException;
//import com.example.demo.exception.DbException;

import com.example.demo.exception.ErrorMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {
    @Value("${errorMessage}")
    private String errorMessage;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessage> globalExceptionHandler(Exception ex, WebRequest request) {
        ErrorMessage message = new ErrorMessage(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                new Date(),
                ex.getMessage(),
                request.getDescription(false));

        return new ResponseEntity<ErrorMessage>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(BadSqlGrammarException.class)
    public ResponseEntity<String> badSqlGrammarHandler(BadSqlGrammarException ex, WebRequest request) {
        System.out.println("entering into exceptions INTO BadSqlGrammarException ");
        return new ResponseEntity<String>(errorMessage, HttpStatus.BAD_REQUEST);
    }

}
