public class _03_GamePlayer implements _03_IGamePlayer{

    private String name = "";
    //我的代理是谁
    private _03_IGamePlayer proxy = null;
    public _03_GamePlayer(String _name){
        this.name = _name;
    }

    //找到自己的代理
    public _03_IGamePlayer getProxy(){
        this.proxy = new _03_GamePlayerProxy(this);     //与书上有出入
        return this.proxy;
    }

    //登录
    @Override
    public void login(String user, String password) {
        if(this.isProxy()){
            System.out.println("登录名为"+user+"的用户"+this.name +"登录成功！");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }

    //打怪
    @Override
    public void killBoss() {
        if(this.isProxy()){
            System.out.println(this.name + "在打怪！");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }

    //更新
    @Override
    public void upgrade() {
        if(this.isProxy()){
            System.out.println(this.name + "又升了一级！");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }



    //检验是否是代理访问
    private boolean isProxy(){
        if(this.proxy == null){
            return false;
        }else{
            return true;
        }
    }

}
