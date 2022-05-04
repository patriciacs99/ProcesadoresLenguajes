package traduccion;
import java.util.LinkedList;
import java.util.List;

public class cBloque {
    private List<cParts> conjuntoParts = new LinkedList<>();

    public cBloque(){ }
    public cBloque(List<cParts> conjuntoParts){
        this.conjuntoParts = conjuntoParts;
    }
    public List<cParts> getConjParts(){
        return conjuntoParts;
    }

    //Cabeceras a HTML
    public String imprimeCabecera(){
        String auxS ="";
        for(cParts part: conjuntoParts)
            auxS += "<LI> <A HREF = \"#" + part.getId() + "\">" + part.getCabSimple() + "</A> </LI>\n";

        auxS += "</UL>\n";
        return auxS;
    }

    //Imprimir cabeceras y cuerpo de las funciones y procedimientos
    public String imprimeGeneral() {
        String auxS = imprimeCabecera();
        for (cParts part : conjuntoParts)
            auxS += part.imprimePart();

        return auxS;
    }
}
