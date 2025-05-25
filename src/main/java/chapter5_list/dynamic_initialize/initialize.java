package chapter5_list.dynamic_initialize;

public class initialize {
    public static void main(String[] args) {
        //数组的动态初始化
        //内部元素默认初始化
        int[] number = new int[10];
        String[] name = new String[45];

        //添加学生
        name[0] = "刘珊绮";
        name[1] = "胡煊楠";

        //输出元素
        System.out.println(name[0]);
        System.out.println(name[1]);
        //打印出来的默认初始值是null
        System.out.println(name[2]);

        //数组默认初始化的规律
        //整数类型: 默认初始化值是0
        //小数类型: 默认初始化值是0.0
        //字符类型: 默认初始化值是`/u0000` 空格
        //引用数据类型: 默认初始化值是null
        //布尔类型: 默认初始化值是false

        //静态初始化: 给定具体元素,由系统判断元素个数
        //动态初始化: 给出数组长度,由系统给出元素默认初始值


    }
}
