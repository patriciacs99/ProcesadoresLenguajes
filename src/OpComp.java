public enum OpComp{
    IGUAL, MENOR, MAYOR, MAYOR_IGUAL, MENOR_IGUAL;

    public String toString(){
        switch (this){
            case IGUAL:
                return "=";
            case MENOR:
                return "<";
            case MAYOR:
                return ">";
            case MAYOR_IGUAL:
                return ">=";
            case MENOR_IGUAL:
                return "<=";
        }
        return null;
    }

    public String toHtml(){
        return toString();
    }
}
