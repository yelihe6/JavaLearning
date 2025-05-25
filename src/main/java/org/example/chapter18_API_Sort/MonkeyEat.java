package org.example.chapter18_API_Sort;

public class MonkeyEat {

    public static void main(String[] args) {
        System.out.println(eating(10, 1));
    }

    public static Integer eating(Integer day, Integer reminder) {
        if (day == 1) {
            return reminder;
        }
        reminder = 2 * ( reminder + 1 );
        day--;
        return eating(day,reminder);
    }
}
