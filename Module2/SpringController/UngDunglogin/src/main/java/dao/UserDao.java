package dao;

import model.login;
import model.user;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<user> users;
    static {
        users = new ArrayList<>();
        user u1 = new user();
        u1.setAge(10);
        u1.setName("John");
        u1.setAcccount("john");
        u1.setEmail("john@codegym.vn");
        u1.setPasssword("123456");
        users.add(u1);

        user u2 = new user();
        u2.setAge(15);
        u2.setName("Bill");
        u2.setAcccount("bill");
        u2.setEmail("bill@codegym.vn");
        u2.setPasssword("123456");
        users.add(u2);

        user u3 = new user();
        u3.setAge(16);
        u3.setName("Mike");
        u3.setAcccount("mike");
        u2.setEmail("mike@codegym.vn");
        u3.setPasssword("123456");
        users.add(u3);
    }

    public static user checkLogin(login login){
        for (user u: users) {
            if(u.getAcccount().equals(login.getAccount())
                    && u.getPasssword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}

