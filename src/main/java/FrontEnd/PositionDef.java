package FrontEnd;

import org.antlr.v4.runtime.Token;

public class PositionDef {
    public int line, column;

    public PositionDef(int Line, int Column) {
        line = Line;
        column = Column;
    }

    public PositionDef(PositionDef other) {
        line = other.line;
        column = other.column;
    }

    public PositionDef(Token t) {
        line = t.getLine();
        column = t.getCharPositionInLine();
    }

    public String toString() {
        return "Line " + line + ", Column" + column;
    }
}
