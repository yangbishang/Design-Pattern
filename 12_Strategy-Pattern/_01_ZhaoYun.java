/*
    策略模式的定义：定义一组算法，将每个算法都封装起来，并且使他们之间可以互换
    策略模式的三个角色：
    1）Context封装角色：也叫做上下文角色，起承上启下封装作用，屏蔽高层模块对策略、算法的直接访问，封装可能存在的变化
    2）Strategy抽象策略角色：策略、算法家族的抽象，通常为接口，定义每个策略或算法必须具有的方法和属性。
    3）ConcreteStategy具体策略角色：实现抽象策略中的操作，该类含有具体的算法
 */

public class _01_ZhaoYun {
    public static void main(String[] args) {
        _01_Context context;

        System.out.println("---------------刚刚到吴国的时候拆第一个----------------");
        context = new _01_Context(new _01_BackDoor());  //拿到妙计
        context.operate();      //拆开执行
        System.out.println("---------------刘备乐不思蜀了，拆第二个----------------");
        context = new _01_Context(new _01_GivenGreenLight());  //拿到妙计
        context.operate();      //拆开执行
        System.out.println("--------------孙权的小兵追来了，拆第三个----------------");
        context = new _01_Context(new _01_BlockEnemy());  //拿到妙计
        context.operate();      //拆开执行
    }
}
