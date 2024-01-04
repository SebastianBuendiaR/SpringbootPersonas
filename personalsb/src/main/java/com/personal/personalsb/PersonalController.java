package com.personal.personalsb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class PersonalController {

    @Autowired
    PersonalService personalService;
    
    @GetMapping("/")
    public String returnHome() {
        return "index";
    }

    @GetMapping("/objects")
    public String returnObjets(Model model) {
        model.addAttribute("people",personalService.returnAllPeople());
        return "listobjects";
    }

    @GetMapping("/formobjects")
    public String submitObjects() {
        return "objects";
    }
    
    

    
}
