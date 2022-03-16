package Visitor.Club;

import Visitor.Activity.Squash;
import Visitor.Activity.Trademill;

public interface Visitor {
    void visit(Trademill trademill);
    void visit(Squash squash);

}


