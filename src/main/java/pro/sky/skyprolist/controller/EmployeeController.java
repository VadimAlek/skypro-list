package pro.sky.skyprolist.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pro.sky.skyprolist.Employee;
import pro.sky.skyprolist.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/find")
    public Employee find (@RequestParam (name = "name") String name,
                        @RequestParam(name = "surname") String surname) {
           return employeeService.searchEmployee(name, surname);
    }

    @GetMapping("/add")
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, code = HttpStatus.BAD_REQUEST)
    public Employee add (@RequestParam (name = "name") String name,
                          @RequestParam(name = "surname") String surname){
        return employeeService.addEmployee(name,surname);
    }

    @GetMapping("/remove")
    public  Employee remove (@RequestParam (name = "name") String name,
                     @RequestParam(name = "surname") String surname){
        return employeeService.removeEmployee(name,surname);
    }
}
