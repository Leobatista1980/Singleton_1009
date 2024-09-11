import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private Queue<String> filaDeImpressao;

    public Fila() {
        filaDeImpressao = new LinkedList<>();
    }

    
    public void adicionaDocumento(String documento) {
        filaDeImpressao.add(documento);
        System.out.println("Documento adicionado à fila: " + documento);
    }

    
    public void imprimeDocumento() {
        if (filaDeImpressao.isEmpty()) {
            System.out.println("Nenhum documento na fila para imprimir.");
        } else {
            String documento = filaDeImpressao.peek();
            System.out.println("Imprimindo documento: " + documento);
        }
    }

    
    public void removeDocumento() {
        if (filaDeImpressao.isEmpty()) {
            System.out.println("Nenhum documento na fila para remover.");
        } else {
            String documentoRemovido = filaDeImpressao.poll();
            System.out.println("Documento removido: " + documentoRemovido);
        }
    }

    
    public void removeTodosDocumentos() {
        filaDeImpressao.clear();
        System.out.println("Todos os documentos foram removidos da fila.");
    }
}