public class FireCall implements Runnable {

    FireDepartment fireDepartment;

    FireCall(FireDepartment workFireDepartment) {

        this.fireDepartment = workFireDepartment;
    }

    public void run() {

        fireDepartment.sendACall();
        System.out.println(" Something bad. This is a fire");
    }
}

