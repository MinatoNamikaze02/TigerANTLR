package ast;

public class GreaterThanEq implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    @Override
    public int getLine() {
        return this.line;
    }

    @Override
    public int getColumn() {
        return this.column;
    }

    public Ast left;
    public Ast right;
    public int line;

    public int column;


    public GreaterThanEq(Ast left, Ast right, int line, int column) {
        this.left = left;
        this.right = right;
        this.line = line;
        this.column = column;
    }
}
