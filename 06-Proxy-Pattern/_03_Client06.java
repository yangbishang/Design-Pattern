/*
    强制代理的概念就是要从真实角色查到代理角色，不允许直接访问真实角色。
    高层模块只要调用getProxy就可以访问真实角色的所有方法，它根本就不需要产生一个代理出来，代理的管理已经由真实角色自己完成。
 */

public class _03_Client06 {
    public static void main(String[] args) {
        //定义一个游戏的角色
        _03_IGamePlayer player = new _03_GamePlayer("张三");
        //获得指定代理
        _03_IGamePlayer proxy = player.getProxy();
        proxy.login("zhansan","password");
        proxy.killBoss();
        proxy.upgrade();
    }



}
