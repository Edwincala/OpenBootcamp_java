public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Andrés", 45, "Madrid", "Chef");
        Employee employee2 = new Employee("Javier", 22, "Valencia", "Mesero");

        BusinessAdmin admin1 = BusinessAdmin.getInstance("Jorge", 36, "Madrid", 15);
        BusinessAdmin admin2 = BusinessAdmin.getInstance("Rosa", 32, "Madrid", 16);

        employee1.employeeMessage();
        System.out.println("Ubicación en memoria: " + employee1);

        employee2.employeeMessage();
        System.out.println("Ubicación en memoria: " + employee2);

        admin1.employeeMessage();
        System.out.println("Ubicación en memoria: " + admin1);

        admin2.employeeMessage();
        System.out.println("Ubicación en memoria: " + admin2);
    }
}