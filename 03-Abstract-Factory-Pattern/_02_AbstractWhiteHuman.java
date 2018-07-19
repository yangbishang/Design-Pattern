/*
    白色人种抽象类，负责人种的抽象属性定义：肤色和语言
 */

public abstract class _02_AbstractWhiteHuman implements _02_Human{
    //白色人种的颜色是白色的
    public void getColor(){
        System.out.println("白色人种的皮肤颜色是白色的");
    }

    //白色人种讲话
    public void talk(){
        System.out.println("白色人种会说话，一般说的都是单字节");
    }
}
