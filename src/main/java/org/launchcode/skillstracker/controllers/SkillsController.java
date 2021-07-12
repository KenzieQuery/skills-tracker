package org.launchcode.skillstracker.controllers;
import org.springframework.stereotype.Controller;
//this import will import all annotations
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String startSkills(){
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>VisualBasic</li>" +
                "<li>JavaScript</li>" +
                "</ol>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String skillForm(){
        return "<form method = 'post'>" +
                "Name: " +
                //have to give name to allow input value to be used dynamically
                "<input type = 'text' name = 'userName' />" +
                "<br>My Favorite Language:<br>" +
                //have to give name to allow input value to be used dynamically
                "<select name = 'first'>" +
                "<option>Java</option>" +
                "<option>Visual Basic</option>" +
                "<option>JavaScript</option>" +
                "</select>" +
                "<br>My Second Favorite Language:<br>" +
                //have to give name to allow input value to be used dynamically
                "<select name = 'second'>" +
                "<option>Java</option>" +
                "<option>Visual Basic</option>" +
                "<option>JavaScript</option>" +
                "</select>" +
                "<br>My Third Favorite Language:<br>" +
                //have to give name to allow input value to be used dynamically
                "<select name = 'third'>" +
                "<option>Java</option>" +
                "<option>Visual Basic</option>" +
                "<option>JavaScript</option>" +
                "</select><br>" +
                "<input type = 'submit'>" +
                "</form>";
    }

    @PostMapping("/form")
    @ResponseBody
    //name String
    //favorite String
    //secondFavorite String
    //thirdFavorite String
    public String formResults(@RequestParam String userName, @RequestParam String first, @RequestParam String second, @RequestParam String third){
        return "<h1>" + userName + "</h1>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</ol>";
    }

}
