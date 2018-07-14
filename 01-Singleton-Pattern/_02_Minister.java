//臣子拜见皇帝的过程
public class _02_Minister {
    public static void main(String[] args) {
        //定义5个大臣
        int ministerNum = 5;
        for(int i=0; i<ministerNum ; i++){
            _02_Emperor emperor = _02_Emperor.getInstance();
            System.out.print("第"+(i+1)+"个大臣参拜的是：");
            emperor.say();
        }
    }
}
