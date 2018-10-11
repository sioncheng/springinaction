package springinaction.jm4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyOverrideConfigurer;
import org.springframework.stereotype.Component;

import java.util.Enumeration;
import java.util.Properties;

@Component
public class PropertyOverrider extends PropertyOverrideConfigurer {

    public PropertyOverrider() {
        System.out.println("PropertyOverrider#init");
    }

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactory, Properties props) throws BeansException {
        super.processProperties(beanFactory, props);

        Enumeration pns = props.propertyNames();
        for (;pns.hasMoreElements();) {
            String pn = (String)pns.nextElement();
            System.out.println(String.format("%s = %s", pn, props.get(pn)));
        }
    }
}
