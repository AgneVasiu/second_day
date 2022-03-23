package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pick;
        do {
            System.out.println("Input task number (0 to exit): ");
            try {
                pick = sc.nextInt();
                switch (pick) {
                    case 1:
                        System.out.println("Input two numbers");
                        try {
                            int numberOne;
                            int numberTwo;
                            System.out.println("Enter first number: ");
                            numberOne = sc.nextInt();
                            System.out.println("Enter second number: ");
                            numberTwo = sc.nextInt();
                            if (numberOne == numberTwo)
                                System.out.println("is " + numberOne + " equal to " + numberTwo + "? - true");
                            else System.out.println("is " + numberOne + " equal to " + numberTwo + "? - false");
                            if (numberOne < numberTwo)
                                System.out.println("is " + numberOne + " less than " + numberTwo + "? - true");
                            else System.out.println("is " + numberOne + " less than " + numberTwo + "? - false");
                            if (numberOne <= numberTwo)
                                System.out.println("is " + numberOne + " less or equal to " + numberTwo + "? - true");
                            else System.out.println("is " + numberOne + " less or equal to " + numberTwo + "? - false");
                            if (numberOne > numberTwo)
                                System.out.println("is " + numberOne + " greater than " + numberTwo + "? - true");
                            else System.out.println("is " + numberOne + " greater than " + numberTwo + "? - false");
                            if (numberOne >= numberTwo)
                                System.out.println("is " + numberOne + " greater or equal to " + numberTwo + "? - true");
                            else System.out.println("is " + numberOne + " greater or equal to " + numberTwo + "? - false");
                        } catch (Exception e) {
                            sc.next();
                            System.out.println("Enter numbers");
                        }
                        break;
                    case 2:
                        System.out.println("input two boolean values");
                        try {
                            boolean value1;
                            boolean value2;
                            System.out.println("Enter first boolean value: ");
                            value1 = sc.nextBoolean();
                            System.out.println("Enter second boolean value: ");
                            value2 = sc.nextBoolean();

                            if (value1 == value2) {
                                System.out.println("Value1 " + value1 + " and value2 " + value2 + " equal True");
                            } else {
                                System.out.println("Value1 " + value1 + " and value2 " + value2 + " equal False");
                            }
                        } catch (Exception e) {
                            sc.nextInt();
                            System.out.println("Use true or false");
                        }
                        break;
                    case 3:
                        System.out.println("Enter a whole number to check if it is even number or odd one (answer true/false): ");
                        try {
                            int num = sc.nextInt();

                            if (num % 2 == 0)
                                System.out.println(num + " is " + " True");
                            else
                                System.out.println(num + " is " + "False");
                        } catch (Exception e) {
                            sc.nextInt();
                            System.out.println("Enter numbers");
                        }
                        break;
                    case 4:
                        System.out.println("Enter a whole number to check if it is odd one or even number one (answer false/true): ");
                        try {
                            int num = sc.nextInt();

                            if (num % 2 != 0)
                                System.out.println(num + " is " + " True");
                            else
                                System.out.println(num + " is " + "False");
                        } catch (Exception e) {
                            sc.nextInt();
                            System.out.println("Please use numbers");
                        }
                        break;
                    case 5:
                        System.out.println("Enter your Boolean value (True/False): ");
                        try {
                            boolean value = sc.nextBoolean();
                            if (value == true) {
                                System.out.println("False");
                            } else {
                                System.out.println("True");
                            }
                        } catch (Exception e) {
                            sc.nextInt();
                            System.out.println(" Use true or false");
                        }
                        break;
                    case 6:
                        System.out.println("Enter your two whole numbers");
                        try {
                            int a;
                            int b;
                            System.out.println("Enter your first number: ");
                            a = sc.nextInt();
                            System.out.println("Enter your second  number: ");
                            b = sc.nextInt();
                            if (a == b || a < 0 && b > 0 || a > 1001 && b > 1001)
                                System.out.println("a is " + a + " and b is " + b + " -> true");
                            else
                                System.out.println("a is " + a + " and b is " + b + " -> false");
                        } catch (Exception e) {
                            sc.nextInt();
                            System.out.println("Use numbers");
                        }
                        break;
                    case 0:
                        break;
                }


            } catch (Exception e) {
                pick = -1;
                sc.nextInt();
                System.out.println("You can only add numbers from 1 to 6 ");
            }
        } while (pick != 0);
    }
}
