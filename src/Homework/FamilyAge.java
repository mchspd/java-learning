package Homework;

import java.time.LocalDate;

public class FamilyAge {
    public static void main(String[] args) {
        myFamilyAge();
    }

    static void myFamilyAge(){
        int year = LocalDate.now().getYear();
        int myBirthYear = 1992;
        int myWifeBirthYear = 1995;
        int mySonBirthYear = 2025;
        int myAge = year - myBirthYear;
        int myWifeAge = year - myWifeBirthYear;
        int mySonAge = year - mySonBirthYear;
        int myFamilyAge = myAge + myWifeAge + mySonAge;
        System.out.println("I have " + myAge + " years");
        System.out.println("My wife has " + myWifeAge + " years");
        System.out.println("My son has " + mySonAge + " years");
        System.out.println("Together we have " + myFamilyAge + " years");
    }

}
