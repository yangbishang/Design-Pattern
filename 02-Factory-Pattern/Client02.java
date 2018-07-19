//场景类的调用方法

public class Client02 {
    public static void main(String[] args) {
        Factory creator = new ConcreteFactory();
        Product product = creator.createProduct(ConcreteProduct_01.class);
        /**
         * 继续业务处理
         */

    }
}
