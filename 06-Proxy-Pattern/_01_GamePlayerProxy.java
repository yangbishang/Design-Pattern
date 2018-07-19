public class _01_GamePlayerProxy implements _01_IGamePlayer{

    private _01_IGamePlayer gamePlayer = null;

    public _01_GamePlayerProxy(_01_IGamePlayer _gamePlayer){
        this.gamePlayer = _gamePlayer;
    }

     //代练登录
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    //代练杀怪
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    //代练升级
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
