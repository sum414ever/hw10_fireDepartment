public class FireMan implements Runnable {

    public FireDepartment fireDepartment;
    private String name;

    FireMan(FireDepartment workFireDepartment, String name) {
        this.fireDepartment = workFireDepartment;
        this.name = name;
    }

    public void run() {

        fireDepartment.extinguishTheFire();
        System.out.println(" My name is " + name + " and i put out the fire");
    }
}