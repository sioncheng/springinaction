package sia.jm23;

import org.springframework.web.servlet.ModelAndView;

@MyController
public class Five {

    @MyRequestMapping(path = "/5.do")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("five");

        return modelAndView;
    }
}
