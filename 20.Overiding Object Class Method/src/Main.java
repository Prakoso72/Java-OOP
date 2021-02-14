public class Main {
    public static void main(String[] args) {
        Hewan kucing1 = new Hewan("Pino", 5);
        Hewan kucing2 = new Hewan("Pino", 5);

        //toString
        System.out.println(kucing1);
        System.out.println(kucing2);

        //equals
        System.out.println("\nMenggunakan '=='\t\t\t\t\t\t: " + (kucing1 == kucing2));
        System.out.println("Menggunakan method equals teroveride\t: " + kucing1.equals(kucing2));

        //hashCode
        System.out.println("\nhashCode kucing 1 : " + kucing1.hashCode());
        System.out.println("hashCode kucing 2 : " + kucing2.hashCode());
        //hashCode sama karena true equals
    }
}
