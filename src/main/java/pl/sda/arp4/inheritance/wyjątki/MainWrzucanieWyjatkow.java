package pl.sda.arp4.inheritance.wyjątki;

public class MainWrzucanieWyjatkow {

    public static void main(String[] args) throws Exception {
        try{
        metoda();
    }catch (Exception e) {
            System.out.println("Złapany");
        }
    }
    private static void metoda() throws Exception {
        throw new Exception(":(");
    }

}
