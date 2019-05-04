package model;

public class Employee {
    private int id;
    private String name;
    private String salary;
    private String age;
    private String profile_image;

    public Employee( String employee_name, String employee_salary, String employee_age) {
       // this.id = id;
        this.name = employee_name;
        this.salary = employee_salary;
        this.age = employee_age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }
}
