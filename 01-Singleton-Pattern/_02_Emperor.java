//如果要求一个类只能产生两三个对象呢
//单例模式的扩展------有上限的多例模式

import java.util.ArrayList;
import java.util.Random;

public class _02_Emperor {
    private static int  countNumOfEmperor;

    //创建皇帝(构造函数)
    private _02_Emperor(){
    }
    private _02_Emperor(String name){
        nameList.add(name);
    }

    //定义最多能产生的实例数量
    private static int maxNumOfdEmperor = 2;

    //每个皇帝都有名字，使用一个ArrayList来容纳每个对象的私有属性
    private static ArrayList<String> nameList = new ArrayList<String>();

    //定义一个列表，容纳所有的皇帝实例
    private static ArrayList<_02_Emperor> emperorList = new ArrayList<_02_Emperor>();

    //当前皇帝序列号
    static{
        for(int i=0;i<maxNumOfdEmperor; i++){
            emperorList.add(new _02_Emperor("皇"+(i+1)+"帝"));
        }
    }

    //随机获得一个皇帝对象
    public static _02_Emperor getInstance(){
        Random random = new Random();
        //随机拉出来一个皇帝，只要是精神领袖就成
        countNumOfEmperor = random.nextInt(maxNumOfdEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    //皇帝发话了
    public static void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }

}
