import java.time.LocalDate;

public class Cycle {

    private String name = "";
    private int age;
    private int lastPeriodStartDate;
    private LocalDate dateOfLastPeriod;
    public final int AverageCycleLength = 28;
    private LocalDate menstruationPhaseStartDay;
    private LocalDate menstruationPhaseEndDay;
    private LocalDate ovulationPhaseStartDay;
    private LocalDate ovulationPhaseEndDay;
    private LocalDate fertilityPhaseStartDay;
    private LocalDate fertilityPhaseEndDay;



    public Cycle(String name, int age) {
        this.name = name;
        if (age < 8 || age > 60) {
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

    public LocalDate getDateOfLastPeriod() {
        return dateOfLastPeriod;
    }

    public void setLengthOfLastPeriod(LocalDate dateOfLastPeriod) {
        this.dateOfLastPeriod = dateOfLastPeriod;
    }

    public LocalDate getMenstruationPhaseStartDay() {
        return menstruationPhaseStartDay;
    }

    public void setMenstruationPhaseStartDay(LocalDate menstruationPhaseStartDay) {
        this.menstruationPhaseStartDay = menstruationPhaseStartDay;
    }

    public LocalDate getOvulationPhaseStartDay() {
        return ovulationPhaseStartDay;
    }

    public void setOvulationPhaseStartDay(LocalDate ovulationPhaseStartDay) {
        this.ovulationPhaseStartDay = ovulationPhaseStartDay;
    }

    public int getAverageCycleLength() {
        return AverageCycleLength;
    }


    public LocalDate getMenstruationPhaseEndDay() {
        return menstruationPhaseEndDay;
    }

    public void setMenstruationPhaseEndDay(LocalDate menstruationPhaseEndDay) {
        this.menstruationPhaseEndDay = menstruationPhaseEndDay;
    }

    public LocalDate getOvulationPhaseEndDay() {
        return ovulationPhaseEndDay;
    }

    public void setOvulationPhaseEndDay(LocalDate ovulationPhaseEndDay) {
        this.ovulationPhaseEndDay = ovulationPhaseEndDay;
    }

    public LocalDate getFertilityPhaseStartDay() {
        return fertilityPhaseStartDay;
    }

    public void setFertilityPhaseStartDay(LocalDate fertilityPhaseStartDay) {
        this.fertilityPhaseStartDay = fertilityPhaseStartDay;
    }

    public LocalDate getFertilityPhaseEndDay() {
        return fertilityPhaseEndDay;
    }

    public void setFertilityPhaseEndDay(LocalDate fertilityPhaseEndDay) {
        this.fertilityPhaseEndDay = fertilityPhaseEndDay;
    }
}
