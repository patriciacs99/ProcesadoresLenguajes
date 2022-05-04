public class Const implements ElementoExpresion{
    private String lit;

    public Const (String lit) {
        this.lit = lit.replace("\"\"","\"").replace("''","'");
    }
    public String getLit() {
        return lit;
    }

    public void setLit(String lit) {
        this.lit = lit;
    }

    public String toHtml(Subprograma contexto){
        StringBuilder sb = new StringBuilder();
        sb.append("<SPAN CLASS=\"cte\">");
        sb.append(lit);
        sb.append("</SPAN>");
        return sb.toString();
    }

}