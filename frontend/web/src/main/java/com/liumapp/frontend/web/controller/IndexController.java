package com.liumapp.frontend.web.controller;

import com.liumapp.common.model.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liumapp on 10/9/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private Guest guest;

    @RequestMapping("/")
    public String index (ModelMap modelMap) {

        modelMap.addAttribute("name" , guest.getName());
        modelMap.addAttribute("sex" , guest.getSex());
        return "index";

    }

}
