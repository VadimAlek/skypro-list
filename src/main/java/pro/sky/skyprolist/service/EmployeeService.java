package pro.sky.skyprolist.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprolist.Employee;
import pro.sky.skyprolist.exception.EmployeeAlredyAddedException;
import pro.sky.skyprolist.exception.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {


    List<Employee> employees = new ArrayList<>(10);

    public Employee addEmployee(String name, String surname) throws EmployeeAlredyAddedException{
        Employee emp = new Employee(name, surname);
        if (employees.contains(emp)) {
            throw new EmployeeAlredyAddedException("Сотрудник уже есть в базе.");
        }else {
            employees.add(emp);
            return emp;
        }
    }

    public Employee removeEmployee (String name, String surmane) throws EmployeeNotFoundException {
        Employee employee = new Employee(name, surmane);
        if (employees.contains(employee)) {
            employees.remove(employee);
            return employee;
        } else {
            throw new EmployeeNotFoundException("Сотрудник не найден в базе.");
        }
    }
    public Employee searchEmployee (String name, String surmane) throws EmployeeNotFoundException {
        Employee employee = new Employee(name, surmane);
        if (employees.contains(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException ("Сотрудник не найден в базе");
    }
}