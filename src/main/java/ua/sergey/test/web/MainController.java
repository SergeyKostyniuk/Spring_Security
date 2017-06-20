package ua.sergey.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/")
    public String getMainPage() {
        return "index";
    }

    public String getLogin(@RequestParam(value ="error", required = false)String error,
                           @RequestParam(value ="logout", required = false)String logout,
                           Model model) {
        model.addAttribute("error", error !=null);
        model.addAttribute("logout", error !=null);
        return "login";

    }
}