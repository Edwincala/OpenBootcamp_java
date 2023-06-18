public class BusinessAdmin extends Employee{

    private static BusinessAdmin admin;
    private int personnelInCharge;

    private BusinessAdmin() {}

    public BusinessAdmin(int personnelInCharge) {
        this.personnelInCharge = personnelInCharge;
    }

    public BusinessAdmin(String name, int age, String location, String role, int personnelInCharge) {
        super(name, age, location, role);
        this.personnelInCharge = personnelInCharge;

    }

    public BusinessAdmin(String name, int age, String location, int personnelInCharge) {
        this.setName(name);
        this.setAge(age);
        this.setRole("administrador");
        this.setLocation(location);
        this.personnelInCharge = personnelInCharge;
    }

    @Override
    public void employeeMessage() {
        //super.employeeMessage();
        System.out.println("Hola, mi nombre es " + getName() + ", tengo " + getAge() + " años, trabajo en " + getLocation() + " como " + getRole() + " dirigiendo a " + personnelInCharge + " personas");
    }

    public static BusinessAdmin getInstance(String name, int age, String location, int personnelInCharge) {

        if (admin == null) {
            admin = new BusinessAdmin(name, age, location, personnelInCharge);
        }
        return admin;
    }
}
