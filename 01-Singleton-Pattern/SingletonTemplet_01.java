//懒汉式单例

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonTemplet_01 {
    private static SingletonTemplet_01 singleton = null;

    private static Lock lock = new ReentrantLock();

    private SingletonTemplet_01(){
    }

    //通过该方法获得实例对象
    public static SingletonTemplet_01 getSingleton(){
        lock.lock();
        if(singleton == null){
            singleton = new SingletonTemplet_01();
        }
        lock.unlock();
        return singleton;
    }

}
