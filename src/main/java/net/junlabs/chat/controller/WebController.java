package net.junlabs.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/chat")
    public String chat(Model model){
        return "/chat/index";
    }
}
