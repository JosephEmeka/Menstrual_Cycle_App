/*
This is a Semicolon task to research about monthly periods and create a menstrual cycle app
Menstrual Cycle is the sequence of events that occur within a woman's body as it prepares for the possibility of pregnancy each month.
A menstrual cycle spans across the first day of her period to the first day of her next period (usually 21 – 35 days).
Your menstrual cycle is divided sequentially into the Menstrual phase, Follicular phase, Ovulation phase and luteal phase.
*/

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CycleCalculatorApp {


    public static void main(String[] args) {
        getMainMenuInputForCycleCalculatorApp();

    }


    public static void getMainMenuInputForCycleCalculatorApp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to your Period calculator!!! ");
        System.out.println("What is your name?: ");
        String name = input.nextLine();
        while (!name.matches("[a-zA-z ]+")) {
            System.out.println("What is your name?: ");
            name = input.nextLine();
        }
        System.out.println("How old are you? (Age must be within 9- 60 years): ");
        int age = input.nextInt();
        Cycle myCycle = new Cycle("", 10);
        myCycle.setName(name);
        myCycle.setAge(age);
        System.out.println("When was your last period? (Enter a date (DD/MM/YYYY): ");
        String myLastPeriodDateString = input.next();

        DateTimeFormatter myDateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate myLastPeriodDate = LocalDate.parse(myLastPeriodDateString, myDateFormatter);



        int myLastPeriodDay = myLastPeriodDate.getDayOfMonth();
        Month thislastPeriodMonth = myLastPeriodDate.getMonth();
        int thisLastPeriodYear = myLastPeriodDate.getYear();

        myCycle.setLastPeriodStartDate(myLastPeriodDate.getDayOfMonth());


        LocalDate ovulationStartDate = LocalDate.of(thisLastPeriodYear,thislastPeriodMonth,myLastPeriodDay).plusDays(13);
        LocalDate exactOvulationDate = LocalDate.of(thisLastPeriodYear,thislastPeriodMonth,myLastPeriodDay).plusDays(14);
        LocalDate ovulationEndDate = LocalDate.of(thisLastPeriodYear,thislastPeriodMonth,myLastPeriodDay).plusDays(16);
        LocalDate menstruationStartDate = LocalDate.of(thisLastPeriodYear,thislastPeriodMonth,myLastPeriodDay).plusDays(myCycle.getAverageCycleLength());
        LocalDate menstruationEndDate = LocalDate.of(thisLastPeriodYear,thislastPeriodMonth,myLastPeriodDay).plusDays(32);
        LocalDate startOfFertileDate = LocalDate.of(thisLastPeriodYear,thislastPeriodMonth,myLastPeriodDay).plusDays(9);
        LocalDate endOfFertileDate = LocalDate.of(thisLastPeriodYear,thislastPeriodMonth,myLastPeriodDay).plusDays(15);



        System.out.println("================================================================");
        System.out.printf("Name: %s%n", myCycle.getName());
        System.out.printf("Age: %d%n", myCycle.getAge());
        System.out.println("Your last period started on: " + myLastPeriodDate);
        System.out.println("=================================================================");
        System.out.println("You are likely to experience Ovulation on " + exactOvulationDate);
        System.out.println("Estimated ovulation days: " + ovulationStartDate + " - " + ovulationEndDate);
        System.out.println("Your Next menstruation Occurs between: " + menstruationStartDate + " - " + menstruationEndDate);
        System.out.println("You are Fertile at this time of your period: " + startOfFertileDate + " - " + endOfFertileDate);
        System.out.println("==================================================================");

    }

    public static void printResultOfMenstrualCycle() {


    }


}

