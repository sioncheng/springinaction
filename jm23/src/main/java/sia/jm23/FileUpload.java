package sia.jm23;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FileUpload extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request
            , HttpServletResponse response) throws IOException {

        MultipartHttpServletRequest multipartHttpServletRequest =
                (MultipartHttpServletRequest) request;

        MultipartFile multipartFile = multipartHttpServletRequest.getFile("fileupload");
        byte[] content = multipartFile.getBytes();

        response.setContentType(multipartFile.getContentType());

        response.getOutputStream().write(content);

        response.getOutputStream().flush();

        return null;
    }
}
