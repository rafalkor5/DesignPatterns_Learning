package Visitor.Activity;

import Visitor.Club.Visitor;

public class Trademill implements Activity{
    private int Distance;

    public Trademill(int distance) {
        Distance = distance;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getDistance() {
        return Distance;
    }
}
