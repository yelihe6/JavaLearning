package org.example.chapter29_Algorithm.SearchAlgorithm;



//基本查找 : 从0索引开始逐个查找

public class BasicSearchDemo1 {
    public static void main(String[] args) {
        int[] array = {131, 77, 88 ,31};
        System.out.println(ElementSearch(array, 68));
    }


    public static boolean ElementSearch(int[] array ,int number){
        if (array.length > 0){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    return true;
                }
            }
        }
        return false;
    }
}
