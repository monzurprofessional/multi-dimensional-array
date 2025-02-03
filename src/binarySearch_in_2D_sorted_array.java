public class binarySearch_in_2D_sorted_array {

    //Time complexity: O(nlogn)
    public static boolean binaryIn2D(int [][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {

            int start = 0, end = matrix.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (matrix[i][mid] == key) {
                    return true;
                }
                if (matrix[i][mid] > key) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return false;
    }
    //Time Complexity: O(n^2)
    public static boolean binarySearch_In_2D(int [][] matrix, int key) {
        int n = matrix.length;
        int m =matrix[0].length;
        int start = 0;
        int end = (n*m) -1;
        while(start<=end){
            int mid =(start+end)/2;
            int mid_value = matrix[mid/ m][mid% m];
            if(key==mid_value){
                return true;
            }
            if (mid_value > key) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] matrix = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}};
        int []matrix2={1,2,3,4,5,6,7,8,9};
        System.out.println(binaryIn2D(matrix,13));
        System.out.println(binarySearch_In_2D(matrix,18));
    }
}
