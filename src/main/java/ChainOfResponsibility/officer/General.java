package ChainOfResponsibility.officer;

import ChainOfResponsibility.message.Message;

public class General extends Officer{

    private static final int CODE = 333;
    private static final String NAME = "Generał";

    @Override
    public void processMessage(Message message) {
        if(message.getOficerRank().equals(OficerRank.GENERAL)
                && message.getCODE() == CODE){
            System.out.println(NAME + " Otrzymał wiadomość : " + message.getContent());
        } else {
            System.out.println("Wiadomość nie do odszyfrowania");
        }
    }
    public String getName(){
        return NAME;
    }
}
