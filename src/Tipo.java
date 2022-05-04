public enum Tipo {
    integer, real;

    public String toHtml(){
        StringBuilder sb = new StringBuilder();
        sb.append("<SPAN CLASS=\"palres\">");
        sb.append(this.toString());
        sb.append("</SPAN>");
        return sb.toString();
    }
}