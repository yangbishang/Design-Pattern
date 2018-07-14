//皇帝类
public class _01_Emperor {

    //初始化一个皇帝
    private static final _01_Emperor emperor = new _01_Emperor();

    //世俗和道德约束你，目的就是不希望产生第二个皇帝
    private _01_Emperor(){
    }

    public static _01_Emperor getInstance(){
        return emperor;
    }

    //皇帝发话了
    public static void say(){
        System.out.println("我就是皇帝某某某...");
    }
}
