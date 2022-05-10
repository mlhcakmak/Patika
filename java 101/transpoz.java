public class transpoz {

    public static  void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] temp = new int[matrix[0].length][matrix.length];
        System.out.println("Matris: ");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                temp[j][i] = matrix[i][j];



            }

        }
        display(matrix);



        System.out.println("Transpoz: ");
        for(int k=0; k<temp.length; k++){
          for(int l=0; l<temp[0].length; l++){
            System.out.print(temp[k][l]+" ");
        }
        System.out.println();
    }
    }
    public static void display(int[][] m){
        System.out.println("Matris: ");
        for(int k=0; k<m.length; k++){
            for(int l=0; l<m[0].length; l++){
                System.out.print(m[k][l]+" ");
            }
            System.out.println();
        }

    }

}



