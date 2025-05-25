package chapter14_API_Object.Objects;

import java.util.Objects;

public class demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        User user1 = new User("张嘉佳","18",arr);
        User user2 = new User("张嘉佳","18",arr);


        boolean equals = Objects.equals(user1, user2);
        System.out.println(equals);
    }
}
