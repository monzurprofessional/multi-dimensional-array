import java.util.*;
public class Create {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int matrix [][] = new int[3][5];
        for(int r=0; r<matrix.length; r++){
            for(int c=0; c<matrix[0].length; c++){
                matrix[r][c]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("printing the array with loops");
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
    }
}
