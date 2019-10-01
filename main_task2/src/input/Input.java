package input;
import java.util.Scanner;

public class Input {
    public static int input() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        while(number < 1){
            System.out.println("Enter a natural number!");
            number = scan.nextInt();
        }
        return number;
    }
}
