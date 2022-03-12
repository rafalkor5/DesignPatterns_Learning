package ChainOfResponsibility;


import ChainOfResponsibility.message.Message;
import ChainOfResponsibility.officer.*;

public class Main {
    public static void main(String[] args) {
        //Utworzenie wiadomości
        Message message = new Message("No siema",333, OficerRank.GENERAL);
        //Tworzenie Officerów
        Officer sergent = new Sergeant();
        Officer capitan = new Captain();
        Officer general = new General();
        //Ustawianie Odpowiedzialności
        sergent.setSuperiorOfficer(capitan);
        capitan.setSuperiorOfficer(general);
        //Przekazanie wiadomości
        sergent.processMessage(message);

}}
