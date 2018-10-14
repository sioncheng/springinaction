package sia.jm23;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

@Component
public class MyHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return handler.getClass().isAnnotationPresent(MyController.class);
    }

    @Override
    public ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{

        Method[] methods = handler.getClass().getDeclaredMethods();
        for (Method m :
                methods) {
            MyRequestMapping myRequestMapping = AnnotationUtils.findAnnotation(m, MyRequestMapping.class);
            if (myRequestMapping != null && request.getRequestURI().startsWith(myRequestMapping.path())) {
                return (ModelAndView)m.invoke(handler);
            }

        }

        return null;
    }

    @Override
    public long getLastModified(HttpServletRequest request, Object handler) {
        return 0;
    }
}
