import java.lang.reflect.InvocationHandler;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) throws Exception {
        //定义一个痴迷玩家
        IGamePlayer player = new GamePlayer("张三");
        //定义一个handler
        InvocationHandler handler = new GamePlayIH(player);
        //获得类的ClassLoader
        ClassLoader cl = player.getClass().getClassLoader();
        //动态生产一个代理类
        IGamePlayer proxy =(IGamePlayer) Proxy.newProxyInstance(cl , new Class[]{IGamePlayer.class} , handler);

        //登录
        proxy.login("zhangsan","passwrod");
        //打怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
    }

}
