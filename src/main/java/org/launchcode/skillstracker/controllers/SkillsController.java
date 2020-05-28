package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @RequestMapping
    public String printSkills() {
        return "<h1>Skills Track</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Ruby</li>" +
                "</ol>";
    }

    @GetMapping("form")
    public String createForm() {
        return "<html>" +
                "<body>" +
                "<form action='/form' method='post'>" + // submit a request to /form
                "<h2>Name:</h2><input type='text' name='name'>" +
                "<h2>My favorite language:</h2>" +
                    "<select name='first'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Ruby'>Ruby</option>" +
                    "</select>" +
                "<h2>My second favorite language:</h2>" +
                    "<select name='second'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Ruby'>Ruby</option>" +
                    "</select>" +
                "</h2>" +
                "<h2>My third favorite language:</h2>" +
                    "<select name='third'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Ruby'>Ruby</option>" +
                    "</select>" +
                "</h2>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String printForm(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        return "<h1>" + name + "</h1>" +
                "<h2>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</ol>" +
                "</h2>";
    }
}