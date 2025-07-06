import java.util.Scanner;

public class javaOutputFormat {
        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        
        for (int i = 0; i < 3; i++) {
            String str = scanner.next();
            int num = scanner.nextInt();
            
            // %-15s : left-justified string in 15 characters
            // %03d   : integer with at least 3 digits, padded with zeroes
            System.out.printf("%-15s%03d%n", str, num);
        }
        
        System.out.println("================================");
}
}
