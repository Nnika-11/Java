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

    @Override
    public int compareTo(ComparableTestEstimation other) {
        int res = this.priority-other.priority;
        if(res==0){
            // If priorities are the same, compare by estimated hours
            res = Integer.compare(this.estimatedHours, other.estimatedHours);
        }
        if(res==0){
            // If priorities are the same, compare by taskName
            return this.taskName.compareTo(other.taskName);
        }
        return res;
    }

    public String toString() {
        return "TestEstimation{" +
                "taskName='" + taskName + '\'' +
                ", estimatedHours=" + estimatedHours +
                ", priority=" + priority +
                '}';
    }
}
