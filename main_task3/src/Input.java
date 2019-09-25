import java.util.Scanner;
public class Input {
public static int inputNatural(){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    if(N < 0){
        System.out.println("A number can't be less than zero!");
        N = scan.nextInt();
    }
    return N;
}

public static double[][] initialization(double[][] matrix, int A, int B){
    int diff = B - A;
    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[i].length; j++){
matrix[i][j] = (Math.random()*diff);
        }
    }
    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[i].length; j++){
            System.out.printf("%.2f ", matrix[i][j]);
        }
        System.out.println();
    }
    return matrix;
}
}
