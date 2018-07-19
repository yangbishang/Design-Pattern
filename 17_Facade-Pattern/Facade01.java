/*
    此门面只能访问子系统B
 */
public class Facade01 {
    //应用原有的门面
    private Facade facade = new Facade();
    //对外提供唯一访问子系统B的方法
    public void methodB(){
        this.facade.methodB();
    }
}
