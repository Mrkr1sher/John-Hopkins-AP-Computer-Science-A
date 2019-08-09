/**
* This class models a print job.
*
* @author Krish Thawani
*/

public class Job {
    private int jobID;
    private int printTime;

    public Job(int jobID, int printTime) {
        this.jobID = jobID;
        if (printTime < 10 || printTime > 1000)
            throw new IllegalArgumentException("Print time must be between 10 and 1000 seconds.");
        this.printTime = printTime;
    }

    public int getPrintTime() {
        return printTime;
    }

    public int getJobID() {
        return jobID;
    }

    public String getJob() {
        return String.format("Job ID: %s\tPrint Time: %s seconds%n", jobID, printTime);
    }


}