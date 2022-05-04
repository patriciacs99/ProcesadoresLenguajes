
public enum Sentido implements ElementoLogico{
    TO,DOWNTO;

    public String toString(){
        switch (this){
            case TO:
                return "TO";
            case DOWNTO:
                return "DOWNTO";
        }
        return null;
    }

    @Override
    public String toHtml() {
        return toString();
    }
}

