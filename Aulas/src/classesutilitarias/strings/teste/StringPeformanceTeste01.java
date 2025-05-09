package classesutilitarias.strings.teste;

public class StringPeformanceTeste01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concataString(100_000); //underline pode separar números grandes para facilitar a leitura
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto : "+(fim-inicio)+"ms");     //bateu 2200ms

        inicio = System.currentTimeMillis();
        concataString2(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto : "+(fim-inicio)+"ms");     //bateu 4ms

        inicio = System.currentTimeMillis();
        concataString3(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto : "+(fim-inicio)+"ms");     //bateu 4ms
    }
    public static void concataString(int tamanho){
        String texto = "";
        for (int i = 0;i<tamanho;i++){  // muito lento e custoso
            texto+=i;
        }
    }

    public static void concataString2(int tamanho){
        StringBuilder stringBuilder = new StringBuilder(tamanho);
        String texto = "";
        for (int i = 0;i<tamanho;i++){  // muito mais eficiente
            stringBuilder.append(i);
        }
    }
    public static void concataString3(int tamanho){
        StringBuffer stringBuffer = new StringBuffer(tamanho);
        String texto = "";
        for (int i = 0;i<tamanho;i++){  // mesma coisa que o StringBUilder, mas otimizado para multithread
            stringBuffer.append(i);
        }
    }
}
