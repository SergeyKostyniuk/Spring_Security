package ua.sergey.test.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.sergey.test.domain.Role;
import ua.sergey.test.domain.User;

import static java.util.stream.Collectors.joining;

@Controller
public class MainController {
    @RequestMapping("/")
    public String getMainPage(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = (User)authentication.getPrincipal();


        model.addAttribute("username", user.getUsername() );
        model.addAttribute("roles", user.getAuthorities().stream().map(Role::getAuthority).collect(joining(",")));
        return "index";
    }

    @RequestMapping("/login")
    public String getLogin(@RequestParam(value ="error", required = false)String error,
                           @RequestParam(value ="logout", required = false)String logout,
                           Model model) {
        model.addAttribute("error", error !=null);
        model.addAttribute("logout", error !=null);
        return "login";

    }
}