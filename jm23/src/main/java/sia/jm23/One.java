package sia.jm23;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class One extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("/view/one.html");
        return modelAndView;
    }
}
