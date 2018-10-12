package sia.jm23;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class File extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request
            , HttpServletResponse response)
        throws Exception {

        ModelAndView modelAndView = new ModelAndView();

        View view = getApplicationContext()
                .getBean("viewResolver1", InternalResourceViewResolver.class)
                .resolveViewName("file", Locale.CHINA);

        modelAndView.setView(view);

        return modelAndView;
    }
}
