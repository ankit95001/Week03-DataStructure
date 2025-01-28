package day01linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

class Process {
    int processId;
    int burstTime;
    int priority;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Process[ID=" + processId + ", BurstTime=" + burstTime + ", Priority=" + priority + "]";
    }
}
