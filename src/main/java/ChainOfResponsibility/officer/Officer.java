package ChainOfResponsibility.officer;
import ChainOfResponsibility.message.Message;

abstract public class Officer {
    //Ustawienie Odpowiedzialności
    private Officer superiorOfficer;

    abstract public void processMessage(Message message);
    abstract public String getName();

    public Officer getSuperiorOfficer() {
        return superiorOfficer;
    }
    //Ustawienie Odpowiedzialności
    public void setSuperiorOfficer(Officer superiorOfficer) {
        this.superiorOfficer = superiorOfficer;
    }


}
