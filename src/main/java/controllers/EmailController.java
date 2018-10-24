package controllers;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class EmailController {
    @GetMapping
    private String getValidatePage(){
        return "validate";
    }
    @PostMapping
    private String doCheckAndReturn(@RequestParam String email, Model model){
        String log = "Not a acceptable email";
        if (email.matches("^\\w{6,}@\\w+\\.\\w+$")){
            log = " emal ngon đấy";
            model.addAttribute("color","have");
        }
        model.addAttribute("log",log);
        return "validate";
    }
}
