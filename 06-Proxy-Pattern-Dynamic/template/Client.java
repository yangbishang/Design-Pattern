package template;

import java.lang.reflect.InvocationHandler;

public class Client {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义一个handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        //定义主题代理
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader() , subject.getClass().getInterfaces() , handler);
        //代理行为
        proxy.doSomething("Finish");
    }
}
