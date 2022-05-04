
public enum OpArit implements ElementoExpresion{
    SUMA, RESTA, PRODUCTO, DIVISION,MODULO;

    public String toString(){
        switch (this){
            case SUMA:
                return "+";
            case RESTA:
                return "-";
            case PRODUCTO:
                return "*";
            case DIVISION:
                return "DIV";
            case MODULO:
                return "MOD";
        }
        return null;
    }

    public String toHtml(Subprograma contexto){
        return toString();
    }
}
