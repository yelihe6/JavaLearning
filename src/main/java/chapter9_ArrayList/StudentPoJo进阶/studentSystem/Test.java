package chapter9_ArrayList.StudentPoJo进阶.studentSystem;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        String code = getCode();
        System.out.println(code);
    }

    private static String getCode(){
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            characters.add((char)('a'+i));
            characters.add((char)('A'+i));
        }
        System.out.println(characters);
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

        System.out.println(sb);
        //拿着最后一个索引,和随机索引进行交换!
        char[] chars = sb.toString().toCharArray();
        int randomIndex = r.nextInt(chars.length);
        char temp = chars[randomIndex];
        chars[randomIndex] = chars[chars.length-1];
        chars[chars.length-1] = temp;

        return new String(chars);
    }
}
