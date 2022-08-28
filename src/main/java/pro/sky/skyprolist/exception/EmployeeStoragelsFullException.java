package pro.sky.skyprolist.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "EmployeeStoragelsFullException")
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeStoragelsFullException extends RuntimeException{
    public EmployeeStoragelsFullException(String message){
        super(message);
    }
}
