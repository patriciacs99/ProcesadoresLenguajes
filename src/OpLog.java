
public enum OpLog implements ElementoLogico{
    AND, OR, NOT;

    public String toString(){
        switch (this){
            case AND:
                return "AND";
            case OR:
                return "OR";
            case NOT:
                return "NOT";
        }
        return null;
    }

    @Override
    public String toHtml(Subprograma contexto) {
        return toString();
    }
}