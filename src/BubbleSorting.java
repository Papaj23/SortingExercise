public class BubbleSorting {

    public static void arrayBubbleSort (int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                int temp = 0;

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }




    }

}