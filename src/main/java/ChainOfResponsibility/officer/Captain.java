package ChainOfResponsibility.officer;

import ChainOfResponsibility.message.Message;

public class Captain extends Officer{

    private static final int CODE = 222;
    private static final String NAME = "Kapitan";

    @Override
    public void processMessage(Message message) {
        if(message.getOficerRank().equals(OficerRank.CAPITAN)
                && message.getCODE() == CODE){
            System.out.println(NAME + " Otrzymał wiadomość : " + message.getContent());
        } else {
            System.out.println("Wiadomość została przekazana do " + getSuperiorOfficer().getName());
            getSuperiorOfficer().processMessage(message);
        }
    }
    public String getName(){
        return NAME;
    }

}
