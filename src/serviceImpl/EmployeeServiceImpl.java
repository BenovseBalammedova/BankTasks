package serviceImpl;

import entity.Employee;
import service.CommonService;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements CommonService<Employee>, EmployeeService {
    static List<Employee>employeeList=new ArrayList<>();
    static {
        employeeList.add(new Employee(1, "John Doe", 30, "Manager", "password123", "0505096247", 5, "Sales"));
        employeeList.add(new Employee(2, "Jane Smith", 28, "Developer", "devPass456", "0515096247", 3, "IT"));
        employeeList.add(new Employee(3, "Emily Johnson", 35, "HR Specialist", "hrSecret789", "0705096247", 8, "HR"));
        employeeList.add(new Employee(4, "Michael Brown", 40, "Team Lead", "leadPass012", "0775096247", 10, "Engineering"));
        employeeList.add(new Employee(5, "William Davis", 25, "Support", "supportPass345", "0503986324", 2, "Customer Support"));

    }
    @Override
    public void add(Employee common) {
    employeeList.add(common);
    }

    @Override
    public void delete(int id) {
        employeeList.remove(id-1);

    }

    @Override
    public Employee read(int id) {
        for (int i = 0; i <employeeList.size() ; i++) {
            if (employeeList.get(i).getId()==id) {
                  return employeeList.get(i);
            }

        }

        return null;
    }


    @Override
    public void update(int id, String name, String position) {
       Employee employee=employeeList.get(id);
       employee.setName(name);
       employee.setPosition(position);
       employeeList.add(employee);

    }

    @Override
    public void update(int id, String name) {
        Employee employee=employeeList.get(id);
        employee.setName(name);
        employeeList.add(employee);

    }

    @Override
    public List<Employee> getAllUserByDepartment(String department) {
        return employeeList.stream().filter(user->user.getDepartment().equals(department)).toList();
    }

    @Override
    public List<Employee> getAllUserByAgeRetirement(int age) {
        return employeeList.stream().filter(user->user.getAge()==65).toList();
    }

    @Override
    public List<Employee> getAllUserByAgeRetirementDistance(int age) {
        return employeeList.stream().map(user->new Employee(user.getId(),user.getName(), user.getAge()+6, user.getPhoneNumber(), user.getPosition(), user.getPassword(), user.getYearsOfExperience(), user.getDepartment()))
                .filter(user->user.getAge()==65).toList();
    }

    @Override
    public List<Employee> getAllUserByYearsOfExperience(int yearsOfExperience) {
        return employeeList.stream().filter(user->user.getYearsOfExperience()==yearsOfExperience).toList();
    }

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }

    @Override
    public Employee getById(int id) {
        return employeeList.get(id-1);
    }
}
