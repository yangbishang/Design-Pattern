// Singleton类称为单例类，通过使用private的构造函数确保了在一个应用中只产生一个实例，
// 并且是自行实例化的（在Singleton中自己使用new Singleton())。
// 下面是单例模式的通用源代码（饿汉式单例）

public class SingletonTemplet {
    private static final SingletonTemplet singleton = new SingletonTemplet();

    //不对外开放构造函数，限制产生多个对象
    private SingletonTemplet(){
    }

    //通过该方法获得实例对象
    public static SingletonTemplet getSingleton(){
        return singleton;
    }

    //类中其他方法，尽量是static
    public static void dosomething(){
    }
}
