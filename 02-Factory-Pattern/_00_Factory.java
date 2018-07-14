//抽象工厂类
//抽象工厂类负责定义产品对象的产生
//具体如何生产一个产品的对象，是由具体的工厂类实现的
public abstract  class _00_Factory {
    /**
     * 创建一个产品对象，其输入参数类型可以自行设置
     * 通常为String，Enum，Class等，当然也可以为空
     */
    public abstract <T extends _00_Product> T createProduct(Class<T> c);
}
