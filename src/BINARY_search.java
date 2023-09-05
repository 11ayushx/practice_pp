public class BINARY_search {
    public static void main(String[] args) {
        int arr[] = {1,3,9,21,32,53,74,95,78,90,100};
        int target = 3;
        int ans = binary(arr,target);
        System.out.println(ans);

    }
    static int binary(int []arr, int item) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid  = start + (end - start) /2;
                    if (item < arr[mid]) {
                        end = mid -1;
                    }
                    else if (item > arr[mid]) {
                        start = mid +1;
                    }
               else {
                   return mid ;

                    }
        }
return -1;
    }
}
