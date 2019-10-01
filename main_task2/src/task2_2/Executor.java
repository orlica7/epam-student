package task2_2;

public class Executor {
    public static int number;

    public Executor(int number) {
        this.number = number;
    }

    public static void maxDigit(int number) {
        int max = number % 10;
        while (number > 0) {
            number = number / 10;
            if (max < number % 10) {
                max = number % 10;
            }
        }
        System.out.println("The max digit is " + max);
    }

    public static void palindrom(int number) {
        int k = 0, m = number;
        while (m > 0) {
            k = k * 10 + m % 10;
            m = m / 10;
        }
        if (k == number) {
            System.out.println("The number is a palindrom");
        } else {
            System.out.println("The number isn't a palindrom");
        }
    }

    public static void isPrime(int number) {
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                prime = false;
            }
        }
        if (!prime) {
            System.out.println("The " + number + " is not a prime number");
        } else {
            System.out.println("The " + number + " is a prime number");
        }
    }

    public static void findPrimeDivisors(int number) {
        boolean prime = true;
        int k = 2;
        while (number > k) {
            if ((number % k) == 0) {
                for (int i = 2; i < k; i++) {
                    if ((k % i) == 0) {
                        prime = false;
                    }
                }
                if (prime) {
                    System.out.println(k);
                }
            }
            prime = true;
            k++;
        }
    }

    public static void nodAndNok(int number1, int number2) {
        int nod = 0;
        int multi = number1 * number2;
        while (number1 != 0 && number2 != 0) {
            if (number1 > number2) {
                number1 %= number2;
            } else {
                number2 %= number1;
            }
            nod = number1 + number2;
        }
        System.out.println("NOD = " + nod + " NOK = " + multi / nod);
    }

   public static void howManyDigits(int number) {
        String str1 = "";
        do{
            if(!(str1.contains(String.valueOf(number%10)))){
                str1 += number%10;
            }
            number /= 10;
        } while (number > 0);
        System.out.println("The quantity of different digits is " + str1.length());
    }
}
