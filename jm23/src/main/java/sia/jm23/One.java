package sia.jm23;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Locale;

public class One extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest httpServletRequest,
                                                 javax.servlet.http.HttpServletResponse httpServletResponse)
        throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        View view = getApplicationContext()
                .getBean("viewResolver1", InternalResourceViewResolver.class)
                .resolveViewName("one", Locale.CHINA);

        modelAndView.setView(view);

        return modelAndView;
    }
}
