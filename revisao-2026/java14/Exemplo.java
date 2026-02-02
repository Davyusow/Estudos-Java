public class Exemplo {
    public static void main(String[] args) {
        npeMelhorada();
        var p1 = new Produto("Biscoito", 100, 3.49);
    }

    public static void npeMelhorada() {
        String[][] matriz = new String[5][5];
        matriz[1] = new String[5];
        // matriz[1][0] = "Beltrano";
        // NullPointerException!

        if (matriz[1][0].toUpperCase().equals("s")) {
            System.out.println("Passou!");
        }
    }
}
