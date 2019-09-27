import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

class Executor {
    static void findExtremal(double[][] matrix) {
        double max = matrix[0][0];
        double min = matrix[0][0];
        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                if (min > aDouble) {
                    min = aDouble;
                }
                if (max < aDouble) {
                    max = aDouble;
                }
            }
        }
        System.out.printf("Min = %.2f Max = %.2f \n", min, max);

    }

    static void findAverage(double[][] matrix) {
        double sum = 0, multi = 1;
        double quantity = 0;
        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                sum += aDouble;
                multi *= aDouble;
                quantity++;
            }
        }
        System.out.printf("Arifmetic average = %.2f Geometric average = %.2f ", sum / quantity, Math.pow(multi, (1 / quantity)));
        System.out.println();
    }

    static double findLocalMin(double[][] matrix) {
        int k1 = 0;
        int k2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ((i == 0) && (j == 0)) {
                    if ((matrix[i][j] < matrix[i][j + 1]) && (matrix[i][j] < matrix[i + 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                        return matrix[i][j];
                    }
                } else if ((i == 0) && (j == matrix[0].length - 1)) {
                    if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i + 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                        return matrix[i][j];
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
                        return matrix[i][j];
                    }
                } else if (i == 0) {
                    if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i + 1][j]) && (matrix[i][j] < matrix[i][j + 1])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                        return matrix[i][j];
                    }
                } else if (i == matrix.length - 1) {
                    if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i - 1][j]) && (matrix[i][j] < matrix[i][j + 1])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                        return matrix[i][j];
                    }
                } else if (j == 0) {
                    if ((matrix[i][j] < matrix[i][j + 1]) && (matrix[i][j] < matrix[i + 1][j]) && (matrix[i][j] < matrix[i - 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                        return matrix[i][j];
                    }
                } else if (j == matrix[0].length - 1) {
                    if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i + 1][j]) && (matrix[i][j] < matrix[i - 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                        return matrix[i][j];
                    }
                } else {
                    if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i][j + 1]) && (matrix[i][j] < matrix[i - 1][j]) && (matrix[i][j] < matrix[i + 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of mininmum is " + k1 + " " + k2);
                        return matrix[i][j];
                    }
                }
                }
            }
        return -1;
        }
    static double findLocalMax(double[][] matrix) {
        int k1 = 0;
        int k2 = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if ((i == 0) && (j == 0)) {
                    if ((matrix[i][j] > matrix[i][j+1]) && (matrix[i][j] > matrix[i+1][j])){
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                        return matrix[i][j];
                    }
                }else if ((i == 0) && (j == matrix[0].length - 1)){
                    if ((matrix[i][j] > matrix[i][j-1]) && (matrix[i][j] > matrix[i+1][j])){
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                        return matrix[i][j];
                    }
                }else if ((i == matrix.length - 1) && (j == 0)){
                    if ((matrix[i][j] > matrix[i-1][j]) && (matrix[i][j] > matrix[i][j+1])){
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                        return matrix[i][j];
                    }
                }else if ((i == matrix.length - 1) && (j == matrix[0].length - 1)){
                    if ((matrix[i][j] > matrix[i][j-1]) && (matrix[i][j] > matrix[i-1][j])){
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                        return matrix[i][j];
                    }
                } else if (i == 0) {
                    if ((matrix[i][j] > matrix[i][j - 1]) && (matrix[i][j] > matrix[i + 1][j]) && (matrix[i][j] > matrix[i][j + 1])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                        return matrix[i][j];
                    }
                } else if (i == matrix.length - 1) {
                    if ((matrix[i][j] > matrix[i][j - 1]) && (matrix[i][j] > matrix[i - 1][j]) && (matrix[i][j] > matrix[i][j + 1])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                        return matrix[i][j];
                    }
                } else if (j == 0) {
                    if ((matrix[i][j] > matrix[i][j + 1]) && (matrix[i][j] > matrix[i + 1][j]) && (matrix[i][j] > matrix[i - 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                        return matrix[i][j];
                    }
                } else if (j == matrix[0].length - 1) {
                    if ((matrix[i][j] > matrix[i][j - 1]) && (matrix[i][j] > matrix[i + 1][j]) && (matrix[i][j] > matrix[i - 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                        return matrix[i][j];
                    }
                } else {
                    if ((matrix[i][j] > matrix[i][j - 1]) && (matrix[i][j] > matrix[i][j + 1]) && (matrix[i][j] > matrix[i - 1][j]) && (matrix[i][j] > matrix[i + 1][j])) {
                        k1 = i+1;
                        k2 = j+1;
                        System.out.println("The position of maximum is " + k1 + " " + k2);
                        return matrix[i][j];
                    }
                }
            }
        }
        return -1;
    }

    static void transport(double[][] matrix) {
        System.out.println("Transported matrix is:");
        for (int i = 0; i < matrix[0].length; i++) {
            for (double[] doubles : matrix) {
                System.out.printf("%.2f ", doubles[i]);
            }
            System.out.println();
        }
    }
}
