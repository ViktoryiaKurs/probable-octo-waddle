package homework.hw5streamapi;

import java.util.Arrays;
import java.util.List;

/*
Из списка отделов компании, где каждый отдел имеет список сотрудников,
получить общий список всех сотрудников компании.
 */
public class FlatMap {
    public static void main(String[] args) {
        List<Department> departments = Arrays.asList(
                new Department("IT", Arrays.asList("Анна", "Борис", "Сергей")),
                new Department("HR", Arrays.asList("Мария", "Дмитрий")),
                new Department("Sales", Arrays.asList("Ольга", "Иван", "Елена", "Павел"))
        );

        List<String> allEmployees = departments.stream()
                .flatMap(d -> d.getEmployees().stream())
                .toList();

        System.out.println(allEmployees);
    }
}

class Department {
    private String name;
    private List<String> employees;

    Department(String name, List<String> employees) {
        this.name = name;
        this.employees = employees;
    }

    public List<String> getEmployees() { return employees; }
}