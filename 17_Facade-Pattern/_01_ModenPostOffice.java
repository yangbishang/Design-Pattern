public class _01_ModenPostOffice {
    private _01_ILetterProcess letterProcess = new _01_LetterProcessImpl();

    //扩展后
    private _01KZ_Police letterPolice = new _01KZ_Police();

    //写信，封装，投递，一体化
    public void sendLetter(String context,String address){
        //帮你写信
        letterProcess.writeContext(context);
        //写好信封
        letterProcess.fillEnvelope(address);

        //警察要检查信件----扩展后
        letterPolice.checkLetter(letterProcess);


        //把信放在信封中
        letterProcess.letterIntoEnvelope();
        //邮递信件
        letterProcess.sendLetter();
    }
}
