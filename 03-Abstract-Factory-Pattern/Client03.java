/*
      场景类
      我们可以看到，场景类中，没有任何一个方法与实现类有关系，对于一个产品来说，我们只要知道它的工厂方法就可以直接生产一个产品对象，无需关心它的实现类
 */

public class Client03 {
    public static void main(String[] args) {
        //定义出两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        //生产A1对象
        AbstractProductA  a1 = creator1.createProductA();
        //生产A2对象
        AbstractProductA  a2 = creator2.createProductA();
        //生产B1对象
        AbstractProductB  b1 = creator1.createProductB();
        //生产B2对象
        AbstractProductB b2 = creator2.createProductB();
    }
}
