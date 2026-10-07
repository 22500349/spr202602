package com.thc.spr202602.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/board")
@Controller
public class BoardController {

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return "board/" + page ;
    }

    /*
    public String create(){
        return "board/create";
    }

    @RequestMapping("/update")
    public String update(){

    }

    @RequestMapping("/detail")
    public String detail(){

    }

    @RequestMapping("/list")
    public String list(){
        return "board/list";
    }
     */
}
