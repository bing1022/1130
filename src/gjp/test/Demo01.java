package gjp.test;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {

        User user1=new User();
        user1.setAge(18);

        User user2=new User();
        user2.setAge(20);

        User user3=new User();
        user3.setAge(15);

        User[] users = {user1, user2, user3};
        Arrays.sort(users);

        for (User user:users) {
            System.out.println(user.getAge());
        }
    }
}


class User implements Comparable<User>{

    int age;
    int id;


    public User() {
    }

    public User(int age, int id) {
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        if(this.age > o.getAge()) {
            return 1;
        }else if(this.age < o.getAge()) {
            return -1;
        }else{
            return 0;
        }
    }
}
