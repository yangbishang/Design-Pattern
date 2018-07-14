//场景类的调用方法

public class _00_Client {
    public static void main(String[] args) {
        _00_Factory creator = new _00_ConcreteFactory();
        _00_Product product = creator.createProduct(_00_ConcreteProduct_01.class);
        /**
         * 继续业务处理
         */

    }
}
