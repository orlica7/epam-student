public class Matrix {
    public static void main(String[] args) {
        System.out.println("Enter N");
        int N = Input.inputNatural();
        System.out.println("Enter M");
        int M = Input.inputNatural();
        double[][] matrix = new double[N][M];
        System.out.println("Enter the range of numbers in matrix");
        Input.initialization(matrix, Input.inputNatural(), Input.inputNatural());
        Executor.findExtremal(matrix);
        Executor.findAverage(matrix);
        if (N == 1 || M ==1){
            System.out.println("There is no locals;");
        } else{
            Executor.findLocalMin(matrix);
            Executor.findLocalMax(matrix);
        }
        Executor.transport(matrix);
    }
}
