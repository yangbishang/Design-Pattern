public class _01_LetterProcessImpl implements _01_ILetterProcess {

    //写信
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容。。。"+context);
    }

    //在信封上填写必要的信息
    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收信人地址和姓名。。。"+address);
    }
    //把信放到信封中，并封号
    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放到信封中。。。");
    }

    //塞到邮箱中，邮递
    @Override
    public void sendLetter() {
        System.out.println("邮递信件。。。");
    }
}
