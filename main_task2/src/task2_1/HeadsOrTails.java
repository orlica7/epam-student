package task2_1;
import input.Input;

public class HeadsOrTails {
    public static void main(String[] args) {
        System.out.println("Enter a number of tossing");
        int count = Input.input();
        print(Randomizer.random(count), count);
    }

    public static void print(int count, int counter) {
        System.out.println("Heads = " + count + " Tails = " + (counter - count));
    }

}
