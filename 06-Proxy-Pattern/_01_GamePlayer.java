public class _01_GamePlayer implements _01_IGamePlayer{

    private String name;
    //通过构造函数传递名称
    public _01_GamePlayer(String _name){
        this.name = _name;
    }

    //登录
    @Override
    public void login(String user,String password) {
        System.out.println("登录名为"+user+"的用户"+this.name+"登录成功");
    }

    //打怪
    @Override
    public void killBoss() {
        System.out.println(this.name+"在打怪");
    }

    //升级
    @Override
    public void upgrade() {
        System.out.println(this.name + "又升一级");
    }
}
