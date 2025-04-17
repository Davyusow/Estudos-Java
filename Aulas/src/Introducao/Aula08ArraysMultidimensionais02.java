package Introducao;

public class Aula08ArraysMultidimensionais02 {

    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        int[][] arrayInt2 = {{2,4,6,4}, {2,3,1}, {3,6}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("-----------");
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
        System.out.println("-----------");
    }
}
