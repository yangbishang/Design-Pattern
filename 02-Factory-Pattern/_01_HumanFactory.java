public class _01_HumanFactory extends _01_AbstractHumanFactory {
    @Override
    public <T extends _01_Human> T createHuman(Class<T> c) {
        //定义一个生产的人种
        _01_Human human = null;
        try {
            //生产一个人种
            human = (_01_Human)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T)human;
    }
}
