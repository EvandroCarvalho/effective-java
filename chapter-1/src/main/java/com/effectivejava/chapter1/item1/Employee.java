package com.effectivejava.chapter1.item1;

import java.util.UUID;

import static com.effectivejava.chapter1.item1.Permission.Role.TEAM_MEMBER;

/**
 * Considere métodos static factory em vez dos construtores
 */
public class Employee {

    private final String occupation;
    private final String name;
    private final Integer age;
    private final UUID id;
    private final Permission permission;

    private Employee(String occupation, String name, Integer age, UUID id, Permission permission) {
        this.occupation = occupation;
        this.name = name;
        this.age = age;
        this.id = id;

        /*
         * Vantagem 2: Ao contrário dos construtores, não precisam criar um novo objeto sempre que invocados
         * A imutabilidade é muito importante!
         */
        this.permission = Permission.permissionTypeFactory(TEAM_MEMBER, 1);
    }

    private Employee(EmployeeBuilder employeeBuilder) {
        this.occupation = employeeBuilder.occupation;
        this.name = employeeBuilder.name;
        this.age = employeeBuilder.age;
        this.id = employeeBuilder.id;
        this.permission = Permission.permissionTypeFactory(TEAM_MEMBER, 1);
    }

    /**
     * Vantagem 1: ao contrário dos contrutores, eles tem nomes
     */
    public static Employee createDeveloperEmployeer(String name, Integer age) {
        return new Employee("Developer", name, age, UUID.randomUUID(), null);
    }

    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {
        private String occupation;
        private String name;
        private Integer age;
        private UUID id;

        public Employee builder() {
            return new Employee(this);
        }


        public EmployeeBuilder occupation(String occupation) {
            this.occupation = occupation;
            return this;
        }

        public EmployeeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder id(UUID id) {
            this.id = id;
            return this;
        }
    }

}
