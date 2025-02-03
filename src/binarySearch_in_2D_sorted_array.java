public class binarySearch_in_2D_sorted_array {
    public static void main(String[] args) {
        int [][] matrix2 = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int []matrix={1,2,3,4,5,6,7,8,9};
        System.out.println(binaryIn2D(matrix,3));
    }
    public static int binaryIn2D(int [] matrix, int key){
        int start=0, end=matrix.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(matrix[mid]==key){
                System.out.println("fount at"+ mid);
                return mid;
            }
            if(matrix[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
