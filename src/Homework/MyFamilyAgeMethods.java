package Homework;

import java.time.LocalDate;

public class MyFamilyAgeMethods {
    public static void main(String[] args) {
        int year = getYear();
        int myBirthyear = 1992;
        int myWifeBirthyear = 1995;
        int mySonBirthYear = 2025;
        int myAge = countAge(year, myBirthyear);
        int myWifeAge = countAge(year, myWifeBirthyear);
        int mySonAge = countAge(year, mySonBirthYear);
        double familyAverageAge = countAgeAverage(myAge, myWifeAge, mySonAge);
        displayFamilyAge(myAge, myWifeAge, mySonAge);
        System.out.println("My family average age is " + familyAverageAge + " years");
        isMyFamilyAdult(myAge, myWifeAge, mySonAge);
    }

    private static void isMyFamilyAdult(int myAge, int myWifeAge, int mySonAge) {
        System.out.println("I am adult? " + isAdult(myAge));
        System.out.println("Is my wife adult? " + isAdult(myWifeAge));
        System.out.println("Is my son adult? " + isAdult(mySonAge));
    }

    private static void displayFamilyAge(int myAge, int myWifeAge, int mySonAge) {
        System.out.println("I am " + myAge + " years old");
        System.out.println("My wife is " + myWifeAge + " years old");
        System.out.println("My son is " + mySonAge + " years old");
    }

    static int getYear() {
        return LocalDate.now().getYear();
    }

    static int countAge(int a, int b) {
        int result = a - b;
        return result;
    }

    static double countAgeAverage(int a, int b, int c) {
        double result = (a + b + c) / 3;
        return result;
    }

    static boolean isAdult(int a) {
        boolean result = a >= 18;
        return result;
    }

}
