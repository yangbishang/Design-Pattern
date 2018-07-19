public class _01_Context {
    //构造函数，你要使用那个妙计
    private _01_IStrategy strategy;
    public _01_Context(_01_IStrategy strategy){
        this.strategy = strategy;
    }

    //使用计谋了，看我出招了
    public void operate(){
        this.strategy.operate();
    }

}
