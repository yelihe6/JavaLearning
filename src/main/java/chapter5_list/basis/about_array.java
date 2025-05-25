package chapter5_list.basis;

public class about_array {
    public static void main(String[] args) {
        //数组对应的数据类型向下兼容
        //保证数据的类型和数组的类型是相同的
        int[] arr = new int[]{};    //空数组
        int[] arr1 = {1, 2, 3};     //简化格式
        String[] name = new String[]{"张铭慧", "范雯欣"};
        System.out.println(arr1[0]);    //下标于0开始,与py一样
        System.out.println(name[0]);
        System.out.println(name);       //[Ljava.lang.String;@723279cf
        // 内存地址(十六进制)
        // 整体称为地址值

        int length = name.length;       //数组的长度,元素计数
        System.out.println(length);


        int[] arr0 = new int[4];
        System.out.println(arr0.length);







    }

}
