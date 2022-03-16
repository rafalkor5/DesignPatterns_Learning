package Visitor;

import Visitor.Activity.Trademill;
import Visitor.Club.Visitor;
import Visitor.Club.VisitorImplement;

public class Main {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImplement();
        Trademill trademill = new Trademill(50);
        trademill.accept(visitor);
    }
}
