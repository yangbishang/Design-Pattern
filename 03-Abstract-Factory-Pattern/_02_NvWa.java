public class _02_NvWa {
    public static void main(String[] args) {
        //第一条生产线，男性生产线
        _02_HumanFactory maleHumanFactory = new _02_MaleFactory();
        //第二条生产线，女性生产线
        _02_HumanFactory femaleHumanFactory = new _02_FemaleFactory();
        //生产线建立完毕，开始生产人
        _02_Human maleWhiteHuman = maleHumanFactory.createWhiteHuman();       //创造一个男性白人
        _02_Human femaleWhiteHuman =femaleHumanFactory.createWhiteHuman();    //创造一个女性白人

        maleWhiteHuman.getSex();
        femaleWhiteHuman.getSex();

    }
}
