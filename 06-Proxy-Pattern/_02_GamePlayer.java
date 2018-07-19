public class _02_GamePlayer implements _02_IGamePlayer {
    private String name = "";


    //构造函数限制谁能创造对象，并同时传递名字
    public _02_GamePlayer(_02_IGamePlayer _gamePlayer , String  _name) throws Exception {
        if(_gamePlayer == null){
            throw new Exception("不能创建真实角色！");
        }else{
            this.name = _name;
        }
    }

    //登录
    @Override
    public void login(String user, String password) {
        System.out.println("登录名为"+user+"的用户"+this.name +"登录成功！");
    }

    //杀怪
    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    //升级
    @Override
    public void upgrade() {
        System.out.println(this.name + "又升一级！");
    }
}
