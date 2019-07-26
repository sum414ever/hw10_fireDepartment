public class FireDepartmentRunner {

    public static void run() {

        FireDepartment fireDepartment = new FireDepartment();
        FireCall fireCall = new FireCall(fireDepartment);
        new Thread(fireCall).start();
        FireMan fireMan = new FireMan(fireDepartment, "Chuck Norris");
        new Thread(fireMan).start();
    }
}
