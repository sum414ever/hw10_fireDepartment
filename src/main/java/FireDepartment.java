public class FireDepartment {

    private int calls = 0;

    public synchronized void extinguishTheFire() {

        while (calls < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        calls--;
        System.out.println("The fireman put out the fire");
        System.out.println("The active fire is: " + calls);
        notify();
    }

    public synchronized void acceptCall() {

        while (calls >= 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        calls++;
        System.out.println("Received a call about the fire");
        System.out.println("The active fire is: " + calls);
        notify();
    }
}
