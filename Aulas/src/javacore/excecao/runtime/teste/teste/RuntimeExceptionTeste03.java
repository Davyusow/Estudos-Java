package javacore.excecao.runtime.teste.teste;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        abrirArquivo(); //com CTRL + ALT + M , você extrai todo um bloco de códigos selecionando como um método extracted(nome genérico) nesse caso foi renomeado
    }

    private static void abrirArquivo() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo...");
            throw new Exception("Deu pau");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando Recurso liberado pelo SO");
        }
    }
}
