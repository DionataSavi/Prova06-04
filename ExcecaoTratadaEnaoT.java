public class ExcecaoTratadaEnaoT {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 7;

        //checada
        try {
            System.out.println(n2/n1);
        }catch (Exception e){
            System.out.println("Motivo: " + e.getMessage());
            System.out.println("Impossivel fazer esta divisão...");
        } finally {
            System.out.println("Fim\n");
        }

        //não checada
        System.out.println(n2/n1);
    }
}
