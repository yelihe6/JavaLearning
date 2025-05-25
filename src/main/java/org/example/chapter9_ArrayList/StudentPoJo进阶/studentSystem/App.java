package org.example.chapter9_ArrayList.StudentPoJo进阶.studentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class App {

    static  ArrayList<User> list = new ArrayList<>();

    //初始化数据,提高数据安全性
    static {
        list.add(new User("原神001","100000001","330301200101011000","1234567890"));
        list.add(new User("原神002","100000002","330301200101011001","1234567891"));
        list.add(new User("原神003","100000003","330301200101011002","1234567892"));
    }

    private static final int ADD_STUDENTS = 1;
    private static final int DELETE_STUDENTS = 2;
    private static final int MODIFY_STUDENTS= 3;
    private static final int SEARCH_STUDENTS= 4;
    private static final int EXIT= 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到学生管理系统!");
        while (true) {
            System.out.println("请选择操作: 1.登录 2.注册 3.忘记密码 4.退出系统");
            String choose = sc.next();
            switch (choose){
                case "1" -> {
                    if (!(list.size() > 0)){
                        System.out.println("没有对象,请先注册!");
                    }else {
                        Login(list);
                        System.exit(0);
                    }
                }
                case "2" -> Register(list);
                case "3" -> {
                    if (!(list.size() == 0)){
                        System.out.println("找回密码功能未开启,请先注册!!");
                    }else {
                        ForgetPwd(list);
                    }
                }
                case "4" -> {
                    System.out.println("谢谢使用,再见!");
                    System.exit(0);
                }
                default -> System.out.println("没有这个操作!");
            }
        }
    }

    private static void Register(ArrayList<User> list) {
        //用户名,密码,身份证号码,手机号码放到用户对象中
        //把用户对象添加到集合中
        Scanner sc = new Scanner(System.in);
        User user = new User();
        //1.键盘录入用户名
        while (true) {
            System.out.println("请输入用户名");
            String username = sc.next();
            //先验证格式是否正确再确认是否唯一
            //Ⅰ 用户名长度必须在3-15位之间
            //Ⅱ 只能是字母加数字的组合,但是不能是纯数字
            boolean flag1 = checkUsername(username);
            if (!flag1){
                System.out.println("用户名格式不满足条件");
                continue;
            }
            //Ⅲ用户名唯一
            //校验用户是否唯一
            boolean flag2 = contains(list,username);
            if (!flag2){
                System.out.println("用户名不能重复!");
            }else {
                System.out.println("用户名符合要求!");
                user.setUsername(username);
                break;
            }
        }
        //2.键盘录入密码
        while (true) {
            System.out.println("请输入你的密码:");
            String Pwd = sc.next();
            boolean flag3 = PwdLen(Pwd);
            if (!flag3){
                System.out.println("密码长度不得小于7位");
                continue;
            }
            System.out.println("请再次输入你的密码:");
            String PwdAgain = sc.next();
            if (!Pwd.equals(PwdAgain)){
                System.out.println("两次密码不相同!");
                continue;
            }
            System.out.println("密码输入成功!");
            user.setPassword(Pwd);
            break;
        }
        //3.键盘录入身份证
        while (true) {
            System.out.println("请输入你的身份证号码");
            String ID = sc.next();
            boolean flag4 = Confirm(ID);
            if (flag4){
                System.out.println("身份证号符合要求");
                user.setPersonID(ID);
                break;
            }else {
                System.out.println("身份证号不符合要求!");
            }

        }
        //4.键盘录入手机号码
        while (true) {
            System.out.println("请输入你的手机号码");
            String phoneNum = sc.next();
            boolean flag5 = PNConfirm(phoneNum);
            if (!flag5){
                System.out.println("手机号不符合规范,请重新输入!");
                continue;
            }
            System.out.println("手机号符合规范!");
            user.setPhoneNumber(phoneNum);
            break;
        }

        list.add(user);
        StringJoiner sj = new StringJoiner(",","[","]");
        System.out.println("注册成功!");
        sj.add(user.getUsername());
        sj.add(user.getPassword());
        sj.add(user.getPersonID());
        sj.add(user.getPhoneNumber());
        System.out.println(sj);
    }

    private static boolean PNConfirm(String phoneNum) {
        if (!(phoneNum.length() == 11)){
            return false;
        }
        char c = phoneNum.charAt(0);
        if (c =='0'){
            return false;
        }
        for (int i = 0; i < phoneNum.length(); i++) {
            char k = phoneNum.charAt(i);
            if (!(k <= '9' && k >= '0')){
                return false;
            }
        }
        return true;
    }

    private static boolean Confirm(String id) {
        if (!(id.length()==18)){
            return false;
        }
        for (int i = 0; i < id.length()-1; i++) {
            char c = id.charAt(i);
            if (!(c <= '9' && c >= '0')){
                return false;
            }
        }
        char c1 = id.charAt(0);
        if (c1 == '0'){
            return false;
        }
        char c2 = id.charAt(id.length()-1);

        return (c2 <= '9' && c2 >= '0') || (c2 == 'X') || (c2 == 'x');
    }

    private static boolean PwdLen(String pwd) {
        return pwd.length() >= 7;
    }

    private static boolean contains(ArrayList<User> list, String username) {
        for (User user: list) {
            if (user.getUsername().equals(username)){
                return false;
            }
        }
        return true;
    }

    private static boolean checkUsername(String username) {
        //Ⅰ 用户名长度必须在3-15位之间
        int len = username.length();
        if (len < 3 || len > 15){
            System.out.println("太短小了,用户名长度必须在3-15位之间");
            return false;
        }
        //代码执行至此,说明用户名的长度是符合需要的
        //Ⅱ 只能是字母加数字的组合,
        //循环得到当中每一个字符,如果有一个字符不是字母或者数字,那么就返回false
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z'))){
                System.out.println("只能是字母加数字的组合");
                return false;
            }
        }
        //但是不能是纯数字
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z')||(c <= 'Z' && c >= 'A')){
                count++;
                break;
            }
        }
        return count > 0;
    }

    private static void Login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            //1.键盘录入用户名
            System.out.println("请输入你的用户名:");
            String un = sc.next();
            //校验
            boolean flag1 = ComPare(list,un);
            if (!flag1){
                System.out.println("该用户名不存在,请先注册!");
                break;
            }
            //2.键盘录入密码
            System.out.println("请输入你的密码:");
            String pwd = sc.next();
            boolean flag2 = ComParePwd(list,pwd,un);

            //3.键盘录入验证码
            while (true){
                System.out.println("请输入验证码!:");
                String code = getCode();
                System.out.println("正确的验证码是:"+code);
                String codein = sc.next();
                if (codein.equalsIgnoreCase(code)) {
                    System.out.println("验证码正确!");
                    break;
                }else{
                    System.out.println("验证码错误!请重新输入!");
                }
            }
            if (!flag2) {
                System.out.println("账号或密码错误!");
                System.out.println("你还剩"+(2-i)+"次机会");
                if (i == 2){
                    System.out.println("你的次数用完了,功能被暂时锁定!");
                    break;
                }
            }else {
                System.out.println("登陆成功!");
                System.out.println("你现在可以使用系统了!");
                MainTable();
                break;
            }

        }
    }

    private static boolean ComParePwd(ArrayList<User> list, String pwd, String un) {
        for (User user: list) {
            if (user.getUsername().equals(un) && !(user.getPassword().equals(pwd))) {
                return false;
            } else if (user.getUsername().equals(un) && (user.getPassword().equals(pwd))) {
                return true;
            }
        }
        return true;
    }

    private static boolean ComPare(ArrayList<User> list, String un) {
        for (User user: list) {
            if (user.getUsername().equals(un)){
                return false;
            }
        }
        return true;
    }

    private static String getCode(){
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            characters.add((char)('a'+1));
            characters.add((char)('A'+1));
        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(characters.size());
            char c  = characters.get(index);
            sb.append(c);
        }
        //把一个随机数添加到末尾
        int number = r.nextInt(10);
        sb.append(number);

        //拿着最后一个索引,和随机索引进行交换!
        char[] chars = sb.toString().toCharArray();
        int randomIndex = r.nextInt(chars.length);
        char temp = chars[randomIndex];
        chars[randomIndex] = chars[chars.length-1];
        chars[chars.length-1] = temp;

        return new String(chars);
    }

    private static void ForgetPwd(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的用户名:");
            String username = sc.next();
            boolean flag1 = ComPare(list,username);
            if (!flag1){
                System.out.println("该用户名不存在,请先注册!");
                break;
            }
            System.out.println("请输入你的新密码:");
            String newPwd = sc.next();
            for (User user: list) {
                if (user.getUsername().equals(username)){
                    user.setPassword(newPwd);
                }
            }
        }
    }

    private static void MainTable(){
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Function function = new Function();
        System.out.println("----------欢迎来到学生管理系统----------");
        while (true) {
            System.out.println();
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.println("请输入你的操作:");
            int o = sc.nextInt();
            switch (o){
                case ADD_STUDENTS -> {
                    //增加方法
                    function.add(students);
                }
                case DELETE_STUDENTS-> {
                    //删除方法
                    System.out.println("你想删除的id?");
                    int k  = sc.nextInt();
                    function.delete(k,students);
                }
                case MODIFY_STUDENTS -> {
                    //修改方法
                    System.out.println("你想修改的id?");
                    int k  = sc.nextInt();
                    function.modify(k,students);
                }
                case SEARCH_STUDENTS -> {
                    //查询方法
                    function.geti(students);
                }
                case EXIT -> {
                    System.out.println("退出系统!");
                    //退出
                    System.exit(0);
                }
                default -> System.out.println("没有相关操作!");

            }
//            if (o == 5){
//                break;
//            }
//
//            if (o == 1){
//
//            } else if (o == 2) {
//
//            } else if (o == 3) {
//
//
//            } else if (o == 4) {
//
//            } else if (o == 5) {
//
//                break;
//            }else {
//
//            }
        }
    }



}
