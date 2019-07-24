public class StepTracker {
    private int min = 0, activeDays = 0, totalDays = 0, totalSteps = 0;

    public StepTracker(int min) {
        this.min = min;
    }

    public void addDailySteps(int totalSteps) {
        this.totalSteps += totalSteps;
        if (totalSteps > min)
            activeDays++;
        totalDays++;
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (totalDays == 0)
            return 0;
        return ((double)totalSteps)/totalDays;
    }

}
