package ast;

public class In implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public int in;
    public int ligne;

    public int colonne;

    @Override
    public int getLine() {
        return this.ligne;
    }

    @Override
    public int getColumn() {
        return this.colonne;
    }


    public In(int in, int ligne, int colonne){
        this.in=in;
        this.ligne=ligne;
        this.colonne=colonne;
    }

}