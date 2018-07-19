/*
    抽象工厂类的职责是定义每个工厂要实现的功能
    在通用代码中，抽象工厂定义了两个产品族的产品创建
 */

public abstract class AbstractCreator {
    //创建A产品家族
    public abstract AbstractProductA createProductA();

    //创建B产品家族
    public abstract AbstractProductB createProductB();

}
