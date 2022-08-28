import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int c = 10000;
        if (a<0){
            int b = a * (-1);
            if (b>c){
                System.exit(0);
            }
            else{
                System.out.println("The next number for the number " + a + " is " + (a+1) + ".");
                System.out.println("The privious number for the number " + a + " is " + (a-1) + ".");
            }
        }
    }
}