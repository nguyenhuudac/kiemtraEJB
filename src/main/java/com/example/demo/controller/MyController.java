package com.example.demo.controller;

import com.example.demo.model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @Autowired
    private MyModel myModel;

    @RequestMapping(path = "/product/list", method = RequestMethod.GET)
    public String getList(Model model, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "5") int limit){
        model.addAttribute("pagination",myModel.findAll(PageRequest.of(page - 1,limit)));
        model.addAttribute("page",page);
        model.addAttribute("limit",limit);
        return "product-list";
    }
}
