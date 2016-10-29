public class rotateMatrix {
    public static void main(String[] args){
        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(aMatrix[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        if(matrix.length == matrix[0].length){
            rotateTheMatrix(matrix);
        }
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(aMatrix[j] + " ");
            }
            System.out.println();
        }
    }
    static void rotateTheMatrix(int[][] matrix){
        int length = matrix.length;
        for(int layer = 0; layer < length/2; layer++){
            int last = length - 1 - layer;
            for(int i = layer; i < last; i++){
                int offset = i - layer;
                int temp = matrix[layer][i];
                matrix[layer][i] = matrix[last - offset][layer];
                matrix[last - offset][layer] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = temp;
            }
        }
    }
}