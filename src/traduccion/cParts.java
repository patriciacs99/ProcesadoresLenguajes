package traduccion;

public class cParts {

    private String id; //identificador funcion o procedimiento
    private String cab; // cabecera de funcion o procedimiento
    private String cuerpo; // cuerpo de funcion o procedimiento

    public cParts(){}
    public cParts(String id, String cab,  String cuerpo){
        this.id = id;
        this.cab = cab;
        this.cuerpo = cuerpo;
    }

    public String getId(){
        return id;
    }

    public String getCabSimple(){
        String sAux="";
        String [] cParts = this.cab.split(" ");
        for(int i=1; i<=(cParts.length-1); i++){
            sAux+=cParts[i]+" ";
        }
        return sAux;
    }

    public String imprimePart(){//
        String [] cParts = this.cab.split(" ");
        String sAux ="";

        if (cParts[0].equals("FUNCTION")){
            sAux += "<HR><SPAN CLASS= \"palres\">" + cParts[0] + " </SPAN> <SPAN CLASS = \"palres\">" + cParts[1] + "</SPAN> <SPAN CLASS = \"ident\">" + cParts[2] + "</SPAN> " + cParts[3];//
            for(int i = 4; i<= (cParts.length - 1); i++){
                if(cParts[i].equals("integer") || cParts[i].equals("real"))
                    sAux += "<SPAN CLASS = \"palres\">" + cParts[i] + "</SPAN>";
                else if (cParts[i].equals(","))
                    sAux += ", ";
                else if (cParts[i].equals(")"))
                    sAux += ") ";
                else
                    sAux += "<A NAME = \"" + cParts[i] + "\"></A> <SPAN CLASS = \"ident\">" + cParts[i] + "</SPAN>";
            }
        }
        else{
            sAux += "<HR><SPAN CLASS= \"palres\">" + cParts[0] + "</SPAN> <SPAN CLASS = \"ident\">" + cParts[1] + "</SPAN> " + cParts[2];
            for(int i = 3; i<= (cParts.length - 1); i++){
                if(cParts[i].equals("integer") || cParts[i].equals("real"))
                    sAux += "<SPAN CLASS = \"palres\">" + cParts[i] + "</SPAN>";
                else if (cParts[i].equals(","))
                    sAux += ", ";
                else if(cParts[i].equals(")"))
                    sAux += ")";
                else
                    sAux += "<A NAME = \"" + cParts[i] + "\"></A> <SPAN CLASS = \"ident\">" + cParts[i] + "</SPAN>";
            }

        }
        //Se crea un enlace que lleve a la cabecera de la función en Inicio de rutina y se crea otro enlace que lleve al inicio del programa al pulsar Inicio de programa
        sAux += this.cuerpo + "<A HREF = #" + this.id + "> Inicio de rutina </A><BR> <A HREF = #Inicio> Inicio de programa </A><BR>\n";
        return ("<A NAME = \"" + this.id + "\">" + sAux);
    }
}
