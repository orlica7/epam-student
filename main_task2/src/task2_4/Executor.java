package task2_4;

public class Executor {
    public static void findFriendlyNumbers(int num1, int num2) {
        int sum1 = 0;
        int sum2 = 0;
        boolean bool = false;
        for (int i = num1; i <= num2; i++) {
            sum1 = sumOfDivisors(i);
            for (int j = i + 1; j <= num2; j++) {

                sum2 = sumOfDivisors(j);

                if (sum1 == j && sum2 == i) {
                    System.out.println(i + " and  " + j + " are friendly numbers!");
                    bool = true;
                }

            }

        }
        if(!bool){
            System.out.println("There are no friendly numbers in the range!");
        }

    }

    private static int sumOfDivisors(int divisor) {
        int sum = 1;
        for (int i = 2; i < divisor; i++) {
            if ((divisor % i) == 0) {
                sum += i;
            }
        }
        return sum;
    }
}