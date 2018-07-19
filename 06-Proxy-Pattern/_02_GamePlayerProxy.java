/*
    普通代理的代理者
 */
public class _02_GamePlayerProxy implements _02_IGamePlayer {

    private _02_IGamePlayer gamePlayer = null;

    //通过构造函数传递要对谁进行代练
    public _02_GamePlayerProxy(String name){
        try{
            gamePlayer = new _02_GamePlayer(this , name);
        } catch (Exception e){
            //TODO 异常处理
        }
    }


    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
