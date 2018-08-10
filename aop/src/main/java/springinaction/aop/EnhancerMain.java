package springinaction.aop;

import net.sf.cglib.proxy.Enhancer;

public class EnhancerMain {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Requestable.class);
        enhancer.setCallback(new RequestCtrlCallback());

        Requestable requestable = (Requestable)enhancer.create();
        System.out.println(requestable.request());
    }
}
