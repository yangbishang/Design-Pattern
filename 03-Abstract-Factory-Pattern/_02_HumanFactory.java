/*
    八卦炉接口，用以生产不同肤色人种
 */

public interface _02_HumanFactory {
    //制造一个白色人种
    public _02_Human createWhiteHuman();

    //制造一个黑色人种
    public _02_Human createBlackHuman();
}
