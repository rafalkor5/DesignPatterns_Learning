package ChainOfResponsibility.message;

import ChainOfResponsibility.officer.OficerRank;

public class Message {

    private String content;
    private int CODE;
    private OficerRank oficerRank;

    public Message(String content, int CODE, OficerRank oficerRank) {
        this.content = content;
        this.CODE = CODE;
        this.oficerRank = oficerRank;
    }

    public String getContent() {
        return content;
    }
    public int getCODE() {
        return CODE;
    }
    public OficerRank getOficerRank() {
        return oficerRank;
    }
}
