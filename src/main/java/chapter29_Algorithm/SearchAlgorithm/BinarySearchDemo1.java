package chapter29_Algorithm.SearchAlgorithm;

public class BinarySearchDemo1 {
    public static void main(String[] args) {
        int[] array = {1, 77, 88 ,131};
        System.out.println(binarySearch(array, 88));
    }

    public static int binarySearch(int[] array, int number){
        int minIndex = 0;
        int maxIndex = array.length-1;

        while (true){
            if (minIndex> maxIndex){
                return -1;
            }

            int midIndex = (minIndex+maxIndex) / 2;

            if (array[minIndex] < number){
                minIndex = midIndex + 1;
            } else if (array[minIndex] > number) {
                maxIndex = midIndex - 1;
            } else{
                return midIndex;
            }
        }
    }
}
