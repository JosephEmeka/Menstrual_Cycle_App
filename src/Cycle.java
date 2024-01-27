import java.time.LocalDate;

public class Cycle {

    public int estimatedAverageCycleLength;
    private String name = "";
    private int age = 9;
    private int lastPeriodStartDate;
    private LocalDate lengthOfLastPeriod;
    private int AverageCycleLength;
    private int menstruationPhaseStartDay;
    private int ovulationPhaseStartDay;

    public Cycle(String name, int age) {
        this.name = name;
        if (age < 9 || age > 60) {
            throw new IllegalArgumentException("The allowable age is within the range 9-60");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLastPeriodStartDate() {
        return lastPeriodStartDate;
    }

    public void setLastPeriodStartDate(int lastPeriodStartDate) {


        this.lastPeriodStartDate = lastPeriodStartDate;

    }

    public LocalDate getLengthOfLastPeriod() {
        return lengthOfLastPeriod;
    }

    public void setLengthOfLastPeriod(LocalDate lengthOfLastPeriod) {
        this.lengthOfLastPeriod = lengthOfLastPeriod;
    }

    public int getMenstruationPhaseStartDay() {
        return menstruationPhaseStartDay;
    }

    public void setMenstruationPhaseStartDay(int menstruationPhaseStartDay) {
        this.menstruationPhaseStartDay = menstruationPhaseStartDay;
    }

    public int getOvulationPhaseStartDay() {
        return ovulationPhaseStartDay;
    }

    public void setOvulationPhaseStartDay(int ovulationPhaseStartDay) {
        this.ovulationPhaseStartDay = ovulationPhaseStartDay;
    }

    public int getAverageCycleLength() {
        return AverageCycleLength;
    }

    public void setAverageCycleLength(int averageCycleLength) {
        AverageCycleLength = averageCycleLength;
    }


    public int getEstimatedAverageCycleLength() {
        return estimatedAverageCycleLength;
    }

    public void setEstimatedAverageCycleLength(int estimatedAverageCycleLength) {

        this.estimatedAverageCycleLength = estimatedAverageCycleLength;
    }


}
