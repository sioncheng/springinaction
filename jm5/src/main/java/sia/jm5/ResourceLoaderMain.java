package sia.jm5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

public class ResourceLoaderMain {

    public static void main(String[] args) {

        DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:r1.txt");

        System.out.println(resource);


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        Resource resource1 = applicationContext.getResource("classpath:r1.txt");

        System.out.println(resource1);

        double l = 100.0;
        double h = 60.0;
        double pi = 3.1415926;

        double v = pi * Math.pow(l / 2 / pi , 2) * h;

        System.out.println(v / 1000);
    }
}
