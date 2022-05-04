package traduccion;
import java.util.LinkedList;
import java.util.List;

public class cSent {
    private List<String> conjuntoSentencias = new LinkedList<>();

    public cSent(){}
    public cSent(List<String> conjuntoSentencias){
        this.conjuntoSentencias = conjuntoSentencias;
    }
    public List<String> getconjuntoSentencias(){
        return conjuntoSentencias;
    }

    public String imprimeSentencias(){
        String auxS = "";
        for(String  sentencia: conjuntoSentencias){
            auxS +="<DIV>\n" + sentencia + "</DIV>\n";
        }
        return auxS;
    }
}
