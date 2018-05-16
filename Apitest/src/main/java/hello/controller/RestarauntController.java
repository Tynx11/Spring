package hello.controller;

import hello.model.Restaraunt;
import hello.service.RestarauntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class RestarauntController {

    @Autowired
    RestarauntService restarauntService;

    @GetMapping(value = "/restaraunt")
    public Restaraunt getRestaraunt(@RequestParam (value = "id",defaultValue = "1")Long id){
        return restarauntService.getRestarauntById(id);
    }
    
    @RequestMapping(value = "/restaraunts") // /users/all
    public String showAllRestaraunts(Model model) {
        model.addAttribute("restaraunts", restarauntService.getAllRestaraunts());
        return "all-restaraunts";
    }



}
