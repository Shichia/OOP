import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a<0){
                System.exit(0);
            }
            if (b<0){
                System.exit(0);
            }
            if(a>1000){
                System.exit(0);
            }
            if(b>1000){
                System.exit(0);
            }
            else{
                System.out.println(a*a + b*b);
            }
        }
    }
}
