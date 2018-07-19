public class _02_FemaleFactory implements _02_HumanFactory{
    @Override
    public _02_Human createWhiteHuman() {
        return  new _02_FemaleWhiteHuman();
    }

    @Override
    public _02_Human createBlackHuman() {
        return  new _02_FemaleBlackHuman();
    }
}
