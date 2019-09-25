import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Executor {
    public static void findExtremal(double[][] matrix) {
        double max = matrix[0][0];
        double min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.printf("Min = %.2f Max = %.2f ", min, max);
    }

    public static void findAverage(double[][] matrix) {
        double sum = 0, multi = 1;
        double quantity = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                multi *= matrix[i][j];
                quantity++;
            }
        }
        System.out.printf("Arifmetic average = %.2f Geometric average = %.2f ", sum / quantity, Math.pow(multi, (1 / quantity)));
        System.out.println();
    }

    public static double findLocalMin(double[][] matrix) {
        int k1 = 0;
        int k2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ((i == 0) && (j == 0)) {
                    if ((matrix[i][j] < matrix[i][j + 1]) && (matrix[i][j] < matrix[i + 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                    }
                } else if ((i == 0) && (j == matrix[0].length - 1)) {
                    if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i + 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                    }
                } else if ((i == matrix.length - 1) && (j == 0)) {
                    if ((matrix[i][j] < matrix[i - 1][j]) && (matrix[i][j] < matrix[i][j + 1])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                    }
                } else if ((i == matrix.length - 1) && (j == matrix[0].length - 1)) {
                    if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i - 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                    }
                } else if (i == 0) {
                    if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i + 1][j]) && (matrix[i][j] < matrix[i][j + 1])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                    }
                } else if (i == matrix.length - 1) {
                    if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i - 1][j]) && (matrix[i][j] < matrix[i][j + 1])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                    }
                } else if (j == 0) {
                    if ((matrix[i][j] < matrix[i][j + 1]) && (matrix[i][j] < matrix[i + 1][j]) && (matrix[i][j] < matrix[i - 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                    }
                } else if (j == matrix[0].length - 1) {
                    if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i + 1][j]) && (matrix[i][j] < matrix[i - 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                    }
                } else {
                    if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i][j + 1]) && (matrix[i][j] < matrix[i - 1][j]) && (matrix[i][j] < matrix[i + 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                    }
                }
                }
            }
        return -1;
        }
    public static double findLocalMax(double[][] matrix) {
        int k1 = 0;
        int k2 = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if ((i == 0) && (j == 0)) {
                    if ((matrix[i][j] > matrix[i][j+1]) && (matrix[i][j] > matrix[i+1][j])){
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                    }
                }else if ((i == 0) && (j == matrix[0].length - 1)){
                    if ((matrix[i][j] > matrix[i][j-1]) && (matrix[i][j] > matrix[i+1][j])){
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                    }
                }else if ((i == matrix.length - 1) && (j == 0)){
                    if ((matrix[i][j] > matrix[i-1][j]) && (matrix[i][j] > matrix[i][j+1])){
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                    }
                }else if ((i == matrix.length - 1) && (j == matrix[0].length - 1)){
                    if ((matrix[i][j] > matrix[i][j-1]) && (matrix[i][j] > matrix[i-1][j])){
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                    }
                } else if (i == 0) {
                    if ((matrix[i][j] > matrix[i][j - 1]) && (matrix[i][j] > matrix[i + 1][j]) && (matrix[i][j] > matrix[i][j + 1])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                    }
                } else if (i == matrix.length - 1) {
                    if ((matrix[i][j] > matrix[i][j - 1]) && (matrix[i][j] > matrix[i - 1][j]) && (matrix[i][j] > matrix[i][j + 1])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                    }
                } else if (j == 0) {
                    if ((matrix[i][j] > matrix[i][j + 1]) && (matrix[i][j] > matrix[i + 1][j]) && (matrix[i][j] > matrix[i - 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                    }
                } else if (j == matrix[0].length - 1) {
                    if ((matrix[i][j] > matrix[i][j - 1]) && (matrix[i][j] > matrix[i + 1][j]) && (matrix[i][j] > matrix[i - 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                    }
                } else {
                    if ((matrix[i][j] > matrix[i][j - 1]) && (matrix[i][j] > matrix[i][j + 1]) && (matrix[i][j] > matrix[i - 1][j]) && (matrix[i][j] > matrix[i + 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                    }
                }
            }
        }
        return -1;
    }

    public static void transport(double[][] matrix) {
        System.out.println("Transported matrix is:");
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%.2f ", matrix[j][i]);
            }
            System.out.println();
        }
    }
}

