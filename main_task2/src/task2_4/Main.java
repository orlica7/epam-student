package task2_4;

import input.Input;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the range");
        int num1 = Input.input();
        int num2 = Input.input();
        while (num1 == num2) {
            System.out.println("The numbers must be different! Enter the range again");
            num1 = Input.input();
            num2 = Input.input();
        }
        Executor.findFriendlyNumbers(num1, num2);
    }
}

