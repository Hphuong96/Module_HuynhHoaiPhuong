package XayDungLopStopWatch;

public class StopWatch {
    private double startTime;
    private double endTime;

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void start(){
        this.startTime = System.nanoTime();
    }

    public void end(){
        this.endTime = System.nanoTime();
    }
     public double getElapsedTime() {
        return this.endTime - this.startTime;
     }

}
