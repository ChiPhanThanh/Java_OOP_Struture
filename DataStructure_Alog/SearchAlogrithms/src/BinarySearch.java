public class BinarySearch {

//    public static int Binary_Search(int [] Arr, int l, int r, int k ) {
//        if (r >= l) {
//            int mid = l + (l - r) / 2;
//
//            if (Arr[mid] == k)
//                return mid;
//
//            if (Arr[mid] > k)
//                return Binary_Search(Arr, l, mid - 1, k);
//            return Binary_Search(Arr, mid + 1, r, k);
//        }
//        return -1;
//    }
//
//    public static void main(String[] args){
//
//        BinarySearch ob = new BinarySearch();
//        int[] Arr = { 2, 3, 4, 10, 40 };
//        int n = Arr.length;
//        int k = 4;
//        int result = ob.Binary_Search(Arr, 0, n - 1, k);
//        if (result == -1)
//            System.out.println("Element not present");
//        else
//            System.out.println("Element found at index " + result);
//
//    }

    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 2;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}

