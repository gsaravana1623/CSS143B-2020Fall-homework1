public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution

        int p = 0;
        int e = data.length-1;
        while(p <= e){
            int n = (p+e)/2;

            if(target < data[n]){

                e = n-1;

            }else if (target > data[n]){

                p=n+1;
            }
            else{
                return n;

            }



        }
        return -1; // Place holder
    }
}
