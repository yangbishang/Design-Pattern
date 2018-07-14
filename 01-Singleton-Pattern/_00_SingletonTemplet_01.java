//懒汉式单例

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class _00_SingletonTemplet_01 {
    private static _00_SingletonTemplet_01 singleton = null;

    private static Lock lock = new ReentrantLock();

    private _00_SingletonTemplet_01(){
    }

    //通过该方法获得实例对象
    public static _00_SingletonTemplet_01 getSingleton(){
        lock.lock();
        if(singleton == null){
            singleton = new _00_SingletonTemplet_01();
        }
        lock.unlock();
        return singleton;
    }

}
