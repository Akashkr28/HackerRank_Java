import java.util.Scanner;

public class javaLoopsII {
        public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result = a;
            int power = 1; 
            for (int j = 0; j < n; j++) {
                result += power * b;
                System.out.print(result + " ");
                power *= 2;
            }
            System.out.println();
        }
        in.close();
    }
}

