
//具体工厂类
//具体如何产生一个产品对象
public class _00_ConcreteFactory extends _00_Factory {
    public <T extends _00_Product> T createProduct(Class<T> c){
        _00_Product product = null;
        try{
            product = (_00_Product)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
