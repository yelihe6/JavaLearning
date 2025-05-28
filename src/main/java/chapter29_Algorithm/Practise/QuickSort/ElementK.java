package chapter29_Algorithm.Practise.QuickSort;

public class ElementK {
    public static void main(String[] args) {
        int[] givenArray = {3,2,1,5,6,4};
        System.out.println(quickSortPractise(givenArray,0,givenArray.length-1,7));
    }

    public static int quickSortPractise(int[] array, int s, int e,int target) {

        //判断结束条件
        if (s>=e){
            if (target == array[e]){
                return array.length-e;
            }
            return -1;
        }
        //记录开始与结束节点
        int start = s;
        int end = e;


        //基准数归位
        int baseNumber = array[s];

        while (start < end){
            while (true){
                if (end <= start ||array[end] < baseNumber){
                    break;
                }
                end--;
            }
            while (true){
                if (end <= start || array[start] > baseNumber){
                    break;
                }
                start++;
            }
            //替换数据
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
        }
        //基准数归位
        int temp = array[start];
        array[start] = array[s];
        array[s] = temp;
        if (target == array[start]){
            return array.length-start;
        } else if (target < array[start]) {
            //左边的递归
            return quickSortPractise(array,s,start-1,target);
        }else {
            //右边的递归
            return quickSortPractise(array,start+1,e,target);
        }
    }
}
