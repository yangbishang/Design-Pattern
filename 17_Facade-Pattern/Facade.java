/*
    Facade门面角色：客户端可以调用这个角色的方法。此角色知晓子系统的的所有功能和自认。它没有实际
    的业务逻辑，只是一个委托类
 */

public class Facade {
    //被委托的对象
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    //提供给外部访问的方法
    public void methodA(){
        this.a.doSomethingA();
    }

    public void methodB(){
        this.b.doSomethingB();
    }

    public void methodC(){
        this.c.doSomethingC();
    }
}
