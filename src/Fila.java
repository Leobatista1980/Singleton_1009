public class Fila {
    
    private static Fila instancia;
    private Fila(){}

    public static Fila getInstance(){
        if (instancia == null){
            instancia = new Fila();
        }
        return instancia;
    }
    public void imprimeDocumento(){
        System.out.println("impresso");
            }
    public void removeDocumento(){
        System.out.println("Remove documento");
    }
    public void removeTodosDocumentos(){
        System.out.println("Tudo removido");
    }
    };

    

