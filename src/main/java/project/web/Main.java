package project.web;

import project.web.Dao.UsersDao;
import project.web.Dao.UsersDaoImpl;
import project.web.Model.User;
import project.web.Service.UsersService;
import project.web.Service.UsersServiceImpl;

public class Main {



    public static void main(String[] args) {


        UsersService us = new UsersServiceImpl(new UsersDaoImpl());

        User user = new User("nick","nick");
        us.saveUser(user);


    }
}
