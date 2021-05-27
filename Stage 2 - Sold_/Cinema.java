package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");

        int rows = sc.nextInt();

        System.out.println("Enter the number of seats in each row:");

        int seats = sc.nextInt();
        int totalIncome = 0;

        if (rows * seats < 60) {

            totalIncome = rows * seats * 10;
        } else {

            int front = rows / 2;
            int back = rows - front;

                        totalIncome = (front * seats * 10) + (back * seats * 8);

        }

        System.out.println("Total income:");
        System.out.println("$" + totalIncome);
    }
}