package task2_3;

public class Divisor {
    public static void findDivisors(int number) {
        int sum = 1;
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println("The " + number + " is perfect");
        } else {
            System.out.println("The " + number + " is not perfect");
        }
    }
}
