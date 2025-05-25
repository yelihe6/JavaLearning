package Class;

public class demo {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> forName = Class.forName("Chapter28_Reflection.Class.User");

        System.out.println(forName);

        System.out.println(User.class);

        User user = new User();

        Class<? extends User> className = user.getClass();

        System.out.println(className);


    }

}
