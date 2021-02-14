public interface Tumbuhan {
    void fotosintesis();

    default boolean isSafe(){
        return true;
    }
    /*
    Dengan method deafult, maka method tersebut tidak perlu dioveride, karena
    secara implisi method tersebut sudah dioveride secara otomatis ke class yang
    mengimplements interface ini
     */
}
