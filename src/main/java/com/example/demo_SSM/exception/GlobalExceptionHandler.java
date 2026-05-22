package com.example.demo_SSM.exception;


import com.example.demo_SSM.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
   public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException ex)
   {
   ErrorResponse errorResponse =new ErrorResponse(ex.getMessage(), HttpStatus.valueOf(404));
  return  new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
   }

   @ExceptionHandler(AlreadyExistException.class)
   public ResponseEntity<ErrorResponse> handleAlreadyExistException(AlreadyExistException ex) {
       ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(), HttpStatus.valueOf(409));
       return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
   }
}
