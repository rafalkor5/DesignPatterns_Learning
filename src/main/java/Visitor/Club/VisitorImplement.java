package Visitor.Club;

import Visitor.Activity.Squash;
import Visitor.Activity.Trademill;

public class VisitorImplement implements Visitor{

    @Override
    public void visit(Trademill trademill) {
        System.out.println("Spalone klaorie to : " + trademill.getDistance());
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Spalone klaorie to : " + squash.getMinutesPlayed());
    }
}
