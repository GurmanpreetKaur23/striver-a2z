import java.util.*;

class Solution {
    int thirdLargest(int arr[]) {
        Arrays.sort(arr) ;
        return (arr[arr.length - 3]) ;
    }
}
