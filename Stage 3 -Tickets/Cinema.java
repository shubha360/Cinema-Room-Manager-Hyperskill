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

        char[][] cinemaGrid = new char[rows][seats];

        initializeGrid(cinemaGrid, rows, seats);

        printCinema(cinemaGrid, rows, seats);

        System.out.println("Enter a row number:");

        int selectedRow = sc.nextInt();

        System.out.println("Enter a seat number in that row:");

        int selectedSeat = sc.nextInt();

        cinemaGrid[selectedRow-1][selectedSeat-1] = 'B';

        if (rows * seats < 60) {
            System.out.println("Ticket price: $10");
        } else {

            if (selectedRow <= (rows / 2)) {

                System.out.println("Ticket price: $10");
            } else {
                System.out.println("Ticket price: $8");
            }
        }

        printCinema(cinemaGrid, rows, seats);
    }

    public static void initializeGrid(char[][] grid, int rows, int columns) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                grid[i][j] = 'S';
            }
        }
    }

    public static void printCinema(char[][] grid, int rows, int seats) {

        System.out.println("\nCinema:");

        for (int i = -1; i < rows; i++) {

            if (i == -1) {

                System.out.print(" ");
                for (int j = 1; j <= seats; j++) {

                    System.out.print(" " + j);
                }
                System.out.println();
            } else {
                for (int k = 0; k < seats; k++) {

                    if (k == 0) {
                        System.out.print((i + 1) + " " + grid[i][k]);
                    } else {
                        System.out.print(" " + grid[i][k]);
                    }
                }
                System.out.println();
            }
        }
    }
}