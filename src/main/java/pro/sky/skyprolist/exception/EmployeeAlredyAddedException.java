package pro.sky.skyprolist.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "EmployeeAlredyAddedException")
public class EmployeeAlredyAddedException extends RuntimeException{
    public EmployeeAlredyAddedException(String message) {
        super(message);
    }
}
