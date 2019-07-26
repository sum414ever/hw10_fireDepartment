public class FireDepartment {

    private int countOfCall = 0;

    public synchronized void extinguishTheFire() {

        while (countOfCall < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        countOfCall--;
        System.out.println("The fireman put out the fire");
        System.out.println("The active fire is: " + countOfCall);
        notify();
    }

    public synchronized void sendACall() {

        while (countOfCall >= 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        countOfCall++;
        System.out.println("Received a call about the fire");
        System.out.println("The active fire is: " + countOfCall);
        notify();
    }
}
