package likelionhw.Jpasession;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OreoController {
    @GetMapping("/oreo")
    public String oreo(Model model){
        model.addAttribute("data","helloworld");
        return "oreo";
    }
}
