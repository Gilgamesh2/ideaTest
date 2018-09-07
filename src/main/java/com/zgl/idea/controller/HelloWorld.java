package com.zgl.idea.controller;

import com.zgl.idea.dao.UserDaoImpl;
import com.zgl.idea.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HelloWorld {
    @Autowired
   private  UserDaoImpl userDaoImpl;

    //首页，查出所有 用户
    @RequestMapping(value = "index")

   public ModelAndView test(ModelAndView modelAndView){
        System.out.println("successful!");
//        User user=userDaoImpl.get(14);
//        modelAndView.addObject("userList",userList);
//        modelAndView.setViewName("index");
//        System.out.println(user);
        List<User> userList=userDaoImpl.getAll();
        modelAndView.addObject("userList",userList);
        System.out.println(userList);
        return modelAndView;


   }
   //查出指定no的用户
   @RequestMapping(value="query",method = RequestMethod.POST)
   public  ModelAndView query(@RequestParam  Integer no, ModelAndView modelAndView){
        modelAndView.setViewName("query");
       modelAndView.addObject("user", userDaoImpl.get(no));
       System.out.println("1");
        return modelAndView;
   }


    @RequestMapping(value="delete")
    public  ModelAndView delete(@RequestParam("no")  Integer no, ModelAndView modelAndView){
        modelAndView.setViewName("delete");
        modelAndView.addObject("user", userDaoImpl.get(no));
        System.out.println("1");
        return modelAndView;
    }
}
