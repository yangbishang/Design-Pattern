public class _01_Client06 {
    public static void main(String[] args) {
        //定义一个痴迷的玩家
        _01_IGamePlayer player = new _01_GamePlayer("张三");
        //然后再定义一个代练者
        _01_IGamePlayer proxy = new _01_GamePlayerProxy(player);

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
