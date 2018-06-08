package com.company;

// This won't take long version of FizzBuzz
import java.util.Random;

public class FizzBuzz {

    static Random rand = new Random();
    static int randStart, randEnd;
    public static void main(String[] args) {
        getcrazyFizzBuzz();
    }
    private static void getcrazyFizzBuzz() {
        randStart = 1 + rand.nextInt(101);
        randEnd = 1 + rand.nextInt(101);
        if(randEnd<randStart) {
            System.out.println(randStart);
            System.out.println(randEnd);
            System.out.println("Ending number is less than staring number. Please try again!");
        }else if(randStart == randEnd) {
            System.out.println("Shazam!!");
        }else {
            // getDigits() method checks number of digits
            getDigits();
            // Call the getFizzBuzz() method
            getFizzBuzz();
        }
    }
    private static void getDigits() {
        int numDigits = randEnd - randStart;
        if(numDigits < 10) {
            System.out.println("This won't take long!");
            System.out.println("::::::::::::::::::");
        }

    }
    private static void getFizzBuzz() {
        for(int i = randStart; i <= randEnd; i++) {
            int val = i;
            if((i%3==0) && (i%5==0)) {
                System.out.println("FizzBuzz");
            }else if(i%3==0) {
                System.out.println("Fizz");
            }else if(i%5==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(val);
            }
        }
    }
}
