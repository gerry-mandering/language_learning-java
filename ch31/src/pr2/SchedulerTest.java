package pr2;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {

        System.out.println("Chose the Way of Advisor Allocation");
        System.out.println("R : RoundRobin");
        System.out.println("L: Least Job");
        System.out.println("P: Higher Priority");

        int ch = System.in.read();
        Scheduler   scheduler = null;

        if (ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        } else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        } else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        } else {
            System.out.println("not provided");
        }

        scheduler.getNextCall();
        scheduler.sendCalltoAgent();
    }
}
