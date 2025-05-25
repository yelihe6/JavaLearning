package Demo.Test;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;

        while (true) {
            try {
                System.out.print("请输入女朋友的名字（长度3~10个字符）：");
                name = scanner.nextLine();
                validateName(name);
                break;
            } catch (InvalidNameException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("请输入女朋友的年龄（18~40岁之间）：");
                String ageInput = scanner.nextLine();
                age = Integer.parseInt(ageInput);
                validateAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的不是一个有效的年龄，请重新输入。");
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
//                e.printStackTrace();
            }
        }

        System.out.println("女朋友的名字：" + name);
        System.out.println("女朋友的年龄：" + age);
    }

    private static void validateName(String name) throws InvalidNameException {
        if (name.length() < 3 || name.length() > 10) {
            throw new InvalidNameException("名字长度不符合要求，请重新输入。");
        }
    }

    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 40) {
            throw new InvalidAgeException("年龄不在要求范围内，请重新输入。");
        }
    }
}

//自定义异常

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
