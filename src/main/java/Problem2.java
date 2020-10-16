public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution

        int a = data.length;
        int temp = 0;
        for (int i=0; i<a; i++){

            for(int j=1; j<(a-i); j++ ){

                if (data[j-1] > data[j]) {
                    //this swaps the elements
                    temp = data[j-1];
                    data[j-1] = data[j];
                    data[j]=temp;

                }

            }

        }


    }
}
