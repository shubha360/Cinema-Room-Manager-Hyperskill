package cinema;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
    
    System.out.println("Cinema:");
    for (int i = 0; i <= 7; i++) {
        if (i == 0) {
            System.out.println("  1 2 3 4 5 6 7 8");
        } else {
            for (int j = 1; j <= 8; j++) {
                
                if (j == 1) {
                    System.out.print(i + " S");
                } else {
                    System.out.print(" S");
                }
            }
            System.out.println();
        }
    }
    }
}