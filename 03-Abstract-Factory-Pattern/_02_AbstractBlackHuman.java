/*
    黑色人种抽象类，负责人种的抽象属性定义：肤色和语言
 */

public abstract  class _02_AbstractBlackHuman implements _02_Human{
    public void getColor(){
        System.out.println("黑色人种的皮肤是黑色的。");
    }

    public void talk(){
        System.out.println("黑人会说话，一般人听不懂。");
    }
}
