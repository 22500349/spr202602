package com.thc.spr202602;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller // 어노테이션을 통해 자신이 컨트롤러 라는것을 스프링 에게 알려줌
public class TestController {

    @RequestMapping(value = "gugudan", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String gugudan() {
        StringBuilder str = new StringBuilder();

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                str.append(i + " x " + j + " = " + (i * j) + "\n");
            }
            str.append("\n");
        }

        return str.toString();
    }
}
