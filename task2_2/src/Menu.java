public class Menu {
    public int number;

    public Menu(int number) {
        this.number = number;
    }
    public static void choose(int number) {
        System.out.println("Enter the number of operation\n" +
                "1. The max digit of the number\n" +
                "2. Is the number a palindrom?\n" +
                "3. Is the number prime?\n" +
                "4. All prime divisors of the number\n" +
                "5. Find NOD and NOK of two numbers\n" +
                "6. Find a quantity of different digits of the number");
        switch (Input.input()) {
            case 1: {
                Executor.maxDigit(number);
            }
            break;
            case 2: {
                Executor.palindrom(number);
            }
            break;
            case 3: {
                Executor.isPrime(number);
            }
            break;
            case 4: {
                Executor.findPrimeDivisors(number);
            }
            break;
            case 5: {
                System.out.println("Enter the second number");
                Executor.nodAndNok(number, Input.input());
            }
            break;
            case 6: {
                Executor.howManyDigits(number);
            }
            break;
            default:
                System.out.println("Error");
        }
    }
}
