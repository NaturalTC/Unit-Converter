package com.codewithjose.unitconverter.Controllers;

import com.codewithjose.unitconverter.Objects.Submission;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubmissionController {

    @GetMapping("/submit-data-weight")
    public String showSubmissionForm(Model model) {
        model.addAttribute("submission", new Submission());
        return "weight"; // this is your HTML form template
    }

    @PostMapping("/submit-data-weight")
    public String processSubmission(@ModelAttribute Submission submission, Model model) {
        model.addAttribute("submission", submission);
        return "result"; // page that shows the submitted data
    }
}
