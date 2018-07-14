//抽象人类创建工厂

public abstract class _01_AbstractHumanFactory {

    //定义泛型对createHuman的输入参数产生两层限制
    // 1)必须是Classl类型
    // 2)必须是Human的实现类-------eg.String.class实际上是一个Class<String>类的对象
    public abstract <T extends _01_Human> T createHuman(Class<T> c);
}
