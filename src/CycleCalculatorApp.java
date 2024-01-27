/*
This is a Semicolon task research about monthly periods and create a menstrual cycle app
Menstrual Cycle is the sequence of events that occur within a woman's body as it prepares for the possibility of pregnancy each month.
A menstrual cycle spans across the first day of her period to the first day of her next period (usually 21 – 35 days).
Your menstrual cycle is divided sequentially into the Menstrual phase, Follicular phase, Ovulation phase and Luteal phase.
 */

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CycleCalculatorApp {

    Cycle myCycle;
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
        myCycle.setLastPeriodStartDate(myLastPeriodDate.getDayOfMonth());
        int myLastPeriodDay = myCycle.getLastPeriodStartDate();
        Month thislastPeriodMonth = myLastPeriodDate.getMonth();
        int thisLastPeriodYear = myLastPeriodDate.getYear();

        LocalDate newOvulationDate = LocalDate.of(thisLastPeriodYear,thislastPeriodMonth,myLastPeriodDay).plusDays(14);
        LocalDate newMenstruationDate = LocalDate.of(thisLastPeriodYear,thislastPeriodMonth,myLastPeriodDay).plusDays(28);
        LocalDate newSafeDate = LocalDate.of(thisLastPeriodYear,thislastPeriodMonth,myLastPeriodDay).minusDays(7);
        LocalDate startOfFertileDate = LocalDate.of(thisLastPeriodYear,thislastPeriodMonth,myLastPeriodDay).plusDays(7);
        LocalDate endOfFertileDate = LocalDate.of(thisLastPeriodYear,thislastPeriodMonth,myLastPeriodDay).plusDays(7);
        System.out.println(newOvulationDate);
        System.out.println(newMenstruationDate);
        System.out.println(newSafeDate);
        System.out.println(startOfFertileDate);
        System.out.println(endOfFertileDate);
    }


        public static void showResultOfMenstrualCycle(){





        }
}

