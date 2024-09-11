public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
        
        // Testando os métodos
        fila.adicionaDocumento("Documento 1");
        fila.adicionaDocumento("Documento 2");
        fila.imprimeDocumento();
        fila.removeDocumento();
        fila.imprimeDocumento();
        fila.removeTodosDocumentos();
    }
}
