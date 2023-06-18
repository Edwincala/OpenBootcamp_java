public class Employee {

    public Employee employee;
    private String name;
    private int age;
    private String location;
    private String role;

    public void employeeMessage() {
        System.out.println("Hola, mi nombre es " + name + ", tengo " + age + " años, trabajo en " + location + " como " + role);
    }

    public Employee() {
    }

    public Employee(String name, int age, String location, String role) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
