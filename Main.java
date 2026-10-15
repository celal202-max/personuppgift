public class Main {
    public static void main(String[] args) {

        Person jag = new Person("2000-05-12");
        jag.setNamn("Celal");
        jag.setGatuAdress("storgatan 1");
        jag.setPostnummer("12345");
        jag.setPostort("Stockholm");

        Person kompis = new Person("2001-08-24");
        kompis.setNamn("Alex");
        kompis.setGatuAdress("Villagatan 9");
        kompis.setPostnummer("54321");
        kompis.setPostort("Uppsala");

        System.out.println(jag.getNamn()+" bor på: " + jag.getGatuAdress());
        System.out.println(kompis.getNamn()+" borpå: " + kompis.getGatuAdress());

        kompis.setGatuAdress(jag.getGatuAdress());
        kompis.setPostnummer(jag.getPostnummer());
        kompis.setPostort(jag.getPostort());

        System.out.println("\n--- Efter flytten ---");
        System.out.println(kompis.getNamn() + " har flyttat in hos " + jag.getNamn() + " och bor nu på: " + kompis.getGatuAdress());
    }
}