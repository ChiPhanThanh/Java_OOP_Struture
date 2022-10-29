public class LinerSearch {

    public static int Search(int[] Arr, int k) {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int k = 8;
        int[] Arr = { 5,6,1,4,3,7,8};
        int x = Search(Arr,k);
        if( x == -1){
            System.out.print("Not found");
        }else{
            System.out.print("Found:" + x);
        }

    }

}
