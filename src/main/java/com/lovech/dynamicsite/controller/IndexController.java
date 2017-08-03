package com.lovech.dynamicsite.controller;

import com.lovech.dynamicsite.entity.User;
import com.lovech.dynamicsite.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by luowq on 2017/8/3.
 */
@Controller
public class IndexController {
    @Autowired
   private FooService fooService;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        User user=fooService.getUserById("1");
        model.addAttribute("user",user);
        return "index";
    }
}
