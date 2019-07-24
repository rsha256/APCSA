import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Question 1");
        APCalendar one = new APCalendar();

        System.out.println(one.dayOfWeek(1, 5, 2019)); // returns 6
        System.out.println(one.dayOfWeek(1, 10, 2019)); // returns 4

        System.out.println("\nQuestion 2");

        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays()); // 0 No data have been recorded yet.
        System.out.println(tr.averageSteps()); // 0.0 When no step data have been recorded, the averageSteps method returns 0.0.
        tr.addDailySteps(9000); // This is too few steps for the day to be considered active.
        tr.addDailySteps(5000); // This is too few steps for the day to be considered active.
        System.out.println(tr.activeDays()); // 0 No day had at least 10,000 steps.
        System.out.println(tr.averageSteps()); // 7000.0 The average number of steps per day is (14000 / 2).
        tr.addDailySteps(13000); // This represents an active day.
        System.out.println(tr.activeDays()); // 1 Of the three days for which step data were entered, one day had at least 10,000 steps.
        System.out.println(tr.averageSteps()); // 9000.0 The average number of steps per day is (27000 / 3).
        tr.addDailySteps(23000); // This represents an active day.
        tr.addDailySteps(1111); // This is too few steps for the day to be considered active.
        System.out.println(tr.activeDays()); // 2 Of the five days for which step data were entered, two days had at least 10,000 steps.
        System.out.println(tr.averageSteps()); // 10222.2 The average number of steps per day is (51111 / 5).

        System.out.println("\nQuestion 3a");

        Delimiters threea1 = new Delimiters("(", ")");
        String[] s = {"(", "x + y", ")", " * 5"};
        for (String d : threea1.getDelimitersList(s)) {
            System.out.println(d);
        }
        System.out.println();

        Delimiters threea2 = new Delimiters("<q>", "</q>");
        String[] s2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        for (String d : threea2.getDelimitersList(s2)) {
            System.out.println(d);
        }

        System.out.println("\nQuestion 3b");

        Delimiters threeb1 = new Delimiters("<sup>", "</sup>");
        ArrayList<String> sup1 = new ArrayList<>(Arrays.asList("<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"));
        System.out.println(threeb1.isBalanced(sup1)); // true
        ArrayList<String> sup2 = new ArrayList<>(Arrays.asList("<sup>", "</sup>", "</sup>", "<sup>"));
        System.out.println(threeb1.isBalanced(sup2)); // false
        ArrayList<String> sup3 = new ArrayList<>(Arrays.asList("</sup>"));
        System.out.println(threeb1.isBalanced(sup3)); // false
        ArrayList<String> sup4 = new ArrayList<>(Arrays.asList("<sup>", "<sup>", "</sup>"));
        System.out.println(threeb1.isBalanced(sup4)); // false

        System.out.println("\nQuestion 4");

        LightBoard sim = new LightBoard();

        System.out.println(sim.evaluateLight(0, 3)); // false The light is on, and the number of lights that are on in its column is even.
        System.out.println(sim.evaluateLight(6, 0)); // true The light is off, and the number of lights that are on in its column is divisible by 3.
        System.out.println(sim.evaluateLight(4, 1)); // false Returns the light’s current status.
        System.out.println(sim.evaluateLight(5, 4)); // true Returns the light’s current status.

    }
}
