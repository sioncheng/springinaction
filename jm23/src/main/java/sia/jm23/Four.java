package sia.jm23;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Four {

    @RequestMapping(path = "/4.do")
    public ModelAndView handle() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("four");

        return modelAndView;
    }
}
