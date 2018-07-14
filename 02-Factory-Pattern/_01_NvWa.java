public class _01_NvWa {
    public static void main(String[] args) {
        //声明阴阳八卦炉
        _01_AbstractHumanFactory YinYangLu = new _01_HumanFactory();

        //女娲第一次造人，火候不足，于是白人产生了
        _01_Human whiteHuman = YinYangLu.createHuman(_01_WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        //女娲第二次造人，火候过足，于是黑人产生了
        _01_Human blackHuman = YinYangLu.createHuman(_01_BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }
}
