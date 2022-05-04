
import java.util.List;

public class Identificador implements ElementoExpresion{
    private String nombre;

    public Identificador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private boolean enlazarANombreFuncion(Subprograma contexto){
        //Si el identificador es el nombre del subprograma, lo enlazamos
        if(this.equals(contexto.getIdentificador())) return true;
        //Si no, comprobamos si el identificador coincide con alguno de los parámetros de dicho subprograma
        boolean enlazar = false;
        List<Parametro> parametros = contexto.getParametros();
        int i = 0;
        while(!enlazar && i < parametros.size()){
            enlazar = this.equals(parametros.get(i).getIdentificador());
            i++;
        }
        return enlazar;
    }

    public String toHtml(Subprograma contexto){
        StringBuilder sb = new StringBuilder();
        if(contexto == null){
            sb.append("<SPAN CLASS=\"ident\">");
            sb.append(this.nombre);
            sb.append("</SPAN>");
        }else if(enlazarANombreFuncion(contexto)){
            sb.append("<A HREF=\"#");
            sb.append(contexto.getIdentificador().getNombre());
            sb.append("\">");
            sb.append(this.nombre);
            sb.append("</A>");
        }else{
            sb.append("<A HREF=\"#");
            sb.append(this.getNombre());
            sb.append("\">");
            sb.append(this.nombre);
            sb.append("</A>");
        }

        return sb.toString();
    }

    public String htmlAnchor(){
        StringBuilder sb = new StringBuilder();
        sb.append("<A name=\"");
        sb.append(nombre);
        sb.append("\"></A>");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Identificador that = (Identificador) o;
        return nombre.equals(that.nombre);
    }
}
