package Introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //valor de inicialização padrão:
        //bytr, short, int, long, float, double = 0
        //char = '\u0000' = ''
        //boolean = false
        //String = null
        int[] idades = new int[3];
        for(int i = 0;i < idades.length;i++){
            System.out.println(idades[i]);
        }
        String[] nomes = new String[3];
        nomes[0] = "Luffy";
        nomes[1] = "Goku";
        nomes[2] = "Kurosaki";
        
        for(int i = 0;i < nomes.length;i++){
            System.out.println(nomes[i]);
        }
    }
}
