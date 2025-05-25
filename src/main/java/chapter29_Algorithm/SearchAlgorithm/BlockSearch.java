package chapter29_Algorithm.SearchAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class BlockSearch {

    public static void main(String[] args) {
        int[] array = {12,9,11,15,
                17,16,19,23,
                22,28,27,31,
                29,33,40};
        int number = 16;
        //分块情况
        System.out.println(blockSearch(array, number));
    }

    public static List<List<Integer>> blockSearch(int[] array, int number) {
        int length = array.length;
        int blockNumber = (int) Math.sqrt(length)+1;
        int k = 0;
        int index = 0;
        List<Block> Blocks = new ArrayList<>();
        List<List<Integer>> blocks = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            List<Integer> numbers = new ArrayList<>();
            if (getMaxNumber1(array, i) && getMaxNumber2(array, i)){
                for (int j = index; j <= i ; j++) {
                    numbers.add(array[j]);
                }
                Block block = new Block(array[i],i,index);
                Blocks.add(block);
                index = i+1;
                k++;
            }
            if (!numbers.isEmpty()){
                blocks.add(numbers);
            }
//            if (k == blockNumber){
//                break;
//            }
        }
        int getIndex = indexCheck(Blocks, array, number);
        if (getIndex != -1){
            System.out.println("该数字所在原数组的索引:"+getIndex);
        }else {
            System.out.println("该数字在原数组中不存在");
        }
        return blocks;
    }

    public static int indexCheck(List<Block> blocks, int[] array, int number) {
        int k = 0;
        for (int i = 0; i < blocks.size(); i++) {
            if (blocks.get(i).getMax() >= number){
                k = i;
                break;
            }
        }
        for (int i = blocks.get(k).getMinIndex(); i <= blocks.get(k).getMaxIndex(); i++) {
            if (array[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static boolean getMaxNumber1(int[] array, int i){
        for (int j = 0; j <= i; j++) {
            if (array[j] > array[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean getMaxNumber2(int[] array, int i){
        for (int j = i; j < array.length; j++) {
            if (array[j] < array[i]){
                return false;
            }
        }
        return true;
    }

}

class Block{
    private int max;
    private int maxIndex;
    private int minIndex;


    public Block() {
    }

    public Block(int max, int maxIndex, int minIndex) {
        this.max = max;
        this.maxIndex = maxIndex;
        this.minIndex = minIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return maxIndex
     */
    public int getMaxIndex() {
        return maxIndex;
    }

    /**
     * 设置
     * @param maxIndex
     */
    public void setMaxIndex(int maxIndex) {
        this.maxIndex = maxIndex;
    }

    /**
     * 获取
     * @return minIndex
     */
    public int getMinIndex() {
        return minIndex;
    }

    /**
     * 设置
     * @param minIndex
     */
    public void setMinIndex(int minIndex) {
        this.minIndex = minIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", maxIndex = " + maxIndex + ", minIndex = " + minIndex + "}";
    }
}
