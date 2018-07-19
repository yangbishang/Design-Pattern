/*
    代理主题类：代理类，它负责对真实角色的应用
    把所有抽象主题类定义的方法限制委托给真实主题角色实现，并且在真实主题角色处理完毕前后做预处理和善后处理工作
 */

public class Proxy implements Subject{
    //要代理哪个实现类
    private Subject subject = null;


    //默认被代理者
    public Proxy(){
        this.subject = new Proxy();
    }
    //通过构造函数传递代理者
    public Proxy(Subject _subject){
        this.subject = _subject;
    }


    //实现接口中定义的方法
    @Override
    public void request(){
          this.before();
          this.subject.request();
          this.after();
    }
    //预处理
    private void before(){
        // do something
    }
    //善后处理
    private void after(){
        // do something
    }

}
