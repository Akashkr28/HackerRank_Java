import java.io.*;
import java.util.*;

public class stdinandout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String myString = scanner.next();
        int myInt = scanner.nextInt();
        int newInt = scanner.nextInt();
        int againInt = scanner.nextInt();
        scanner.close();
        
        // System.out.println(myString);
        System.out.println(myInt);
        System.out.println(newInt);
        System.out.println(againInt);
    }
}