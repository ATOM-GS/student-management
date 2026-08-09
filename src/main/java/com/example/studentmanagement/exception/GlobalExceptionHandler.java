package com.example.studentmanagement.exception;
import org.springframework.http.HttpStatus; import org.springframework.web.bind.annotation.*; import java.util.Map;
@RestControllerAdvice public class GlobalExceptionHandler { @ExceptionHandler(RuntimeException.class) @ResponseStatus(HttpStatus.NOT_FOUND) Map<String,String> nf(RuntimeException e){return Map.of("error",e.getMessage());} @ExceptionHandler(IllegalArgumentException.class) @ResponseStatus(HttpStatus.BAD_REQUEST) Map<String,String> br(IllegalArgumentException e){return Map.of("error",e.getMessage());} }
