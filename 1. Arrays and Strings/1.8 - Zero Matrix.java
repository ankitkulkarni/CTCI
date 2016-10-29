public class zeroMatrix {
    public static void main(String[] args){
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 0}, {9, 10, 11, 12}, {13, 0, 15, 16}, {17, 18, 19, 20}};
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(aMatrix[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        makeThemZero(matrix);
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(aMatrix[j] + " ");
            }
            System.out.println();
        }
    }
    static void makeThemZero(int[][] matrix){
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for(int i = 0; i < rows.length; i++){
            if(rows[i]){
                nullifyRow(matrix, i);
            }
        }
        for(int j = 0; j < cols.length; j++){
            if(cols[j]){
                nullifyColumn(matrix, j);
            }
        }
    }
    static void nullifyRow(int[][] matrix, int i){
        for(int j = 0; j < matrix[0].length; j++){
            matrix[i][j] = 0;
        }
    }
    static void nullifyColumn(int[][] matrix, int j){
        for(int i = 0; i < matrix.length; i++){
            matrix[i][j] = 0;
        }
    }
}