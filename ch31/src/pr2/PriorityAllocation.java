package pr2;

public class PriorityAllocation implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("Get the Call from the higher class customer");
    }

    @Override
    public void sendCalltoAgent() {
        System.out.println("Distribute the call tho the Skilled Advisor");
    }
}
