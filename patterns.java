import java.util.*;

public class patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        sc.close();
        
        System.out.println("row=" + row);
        System.out.println("column=" + column);

        // Loop for rows
        for (int i = 0; i < row; i++) {
            // Loop for columns
            for (int j = 0; j < column; j++) {
                System.out.print("1"); // Print without newline
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

