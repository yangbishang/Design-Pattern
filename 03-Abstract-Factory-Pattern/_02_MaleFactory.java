public class _02_MaleFactory implements _02_HumanFactory {
    @Override
    public _02_Human createWhiteHuman() {
        return  new _02_MaleWhiteHuman();
    }

    @Override
    public _02_Human createBlackHuman() {
        return  new _02_MaleWhiteHuman();
    }
}
