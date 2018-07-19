public class _03_GamePlayerProxy implements _03_IGamePlayer , _03_IProxy{

    private _03_IGamePlayer gamePlayer = null;
    //构造函数传递用户名
    public _03_GamePlayerProxy(_03_IGamePlayer _gamePlayer){
        this.gamePlayer = _gamePlayer;
    }

    //登录
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    //杀怪
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    //升级
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }


    //代理的代理暂时还没有，就是自己
    @Override
    public _03_IGamePlayer getProxy() {
        return this;
    }

    @Override
    public void count() {
        System.out.println("升级的总费用是：150元");
    }
}
