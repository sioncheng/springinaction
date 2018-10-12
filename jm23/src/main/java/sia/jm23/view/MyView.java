package sia.jm23.view;

import org.springframework.web.servlet.view.AbstractUrlBasedView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class MyView extends AbstractUrlBasedView {

    @Override
    protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        response.setContentType("text/plain");
        for (Map.Entry<String, Object> entry:
            model.entrySet()){
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue().toString());
            sb.append(System.lineSeparator());

            response.getOutputStream().write(sb.toString().getBytes());
        }

        response.getOutputStream().flush();
    }
}
