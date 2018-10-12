package sia.jm23;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.AbstractController;
import sia.jm23.view.MyView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Three  extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
        View view = new MyView();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setView(view);
        modelAndView.addObject("one", 1);
        modelAndView.addObject("two", 2);
        modelAndView.addObject("three", 3);

        return modelAndView;
    }
}
