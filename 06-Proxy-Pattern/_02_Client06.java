public class _02_Client06 {
     public static void main(String[] args) {

        //然后再定义一个代练者
        _02_IGamePlayer proxy = new _02_GamePlayerProxy("张三");

        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2018,7,15");

        //登录
        proxy.login("zhangsan","passwrod");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
    }
}
