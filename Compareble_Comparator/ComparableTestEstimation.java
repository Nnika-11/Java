package Java.Compareble_Comparator;

public class ComparableTestEstimation implements Comparable<ComparableTestEstimation>{
    private String taskName;
    private int estimatedHours;
    private int priority;

    public ComparableTestEstimation(String taskName, int estimatedHours, int priority) {
        this.taskName = taskName;
        this.estimatedHours = estimatedHours;
        this.priority = priority;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(ComparableTestEstimation o) {
        int priorityComparison = Integer.compare(this.priority, o.priority);
        if (priorityComparison != 0) {
            return priorityComparison;
        }
        // If priorities are the same, compare by estimated hours
        return Integer.compare(this.estimatedHours, o.estimatedHours);
    }
}
