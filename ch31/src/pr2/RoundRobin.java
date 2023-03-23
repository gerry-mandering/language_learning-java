package pr2;

public class RoundRobin implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("Get Call from the Waiting Queue");
    }

    @Override
    public void sendCalltoAgent() {
        System.out.println("Distribute the call to the next advisor");
    }
}
