public class FireCall implements Runnable {

    FireDepartment fireDepartment;

    FireCall(FireDepartment workFireDepartment) {
        this.fireDepartment = workFireDepartment;
    }

    public void run() {

        fireDepartment.acceptCall();
        System.out.println(" Something bad. This is a fire");
    }
}

