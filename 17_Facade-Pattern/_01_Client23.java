public class _01_Client23 {
    public static void main(String[] args) {

        /*----------------------------------------没有邮局的方法--------------------------------------*/
/*

        //创建一个处理信件过程
        _01_ILetterProcess letterProcess = new _01_LetterProcessImpl();
        //开始写信
        letterProcess.writeContext("hello,..............................");
        //开始写信封
        letterProcess.fillEnvelope("happy road,........");
        //把信放在信封里，并封装好
        letterProcess.letterIntoEnvelope();
        //跑到邮局把信塞到邮箱，投递
        letterProcess.sendLetter();

*/
        /*----------------------------------------有邮局的方法--------------------------------------*/
       //现代化的邮局，有这项服务，邮局名称叫Hell Road
        _01_ModenPostOffice hellRoadPostOffice = new _01_ModenPostOffice();

        //你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作
        //定义一个地址
        String address = "Happy Road NO .666";
        //信的内容
        String context = "hello , it is mwe ,do you know ........";

        //你给我发送吧
        hellRoadPostOffice.sendLetter(context,address);

    }
}
