package java9;

public record trywresources() {
    public static void main(String[] args) {
        try (Recurso1 r1 = new Recurso1()) {
            Recurso2 r2 = new Recurso2();
            System.out.println("Try");
        } catch (Exception e) {
            e.printStackTrace();
        } // Pré java 9
        Recurso1 r1 = new Recurso1();
        Recurso2 r2 = new Recurso2();
        try (r1;r2) {
            
            System.out.println("Try");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static class Recurso1 implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("Recurso1.close()");
        }

    }

    static class Recurso2 implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("Recurso2.close()");
        }

    }
}
