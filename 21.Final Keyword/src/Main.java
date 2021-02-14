public class Main {
    public static void main(String[] args) {

    }
}

final class Mobil{
    final int ban = 4;

    void incrementBan(){
        //ban++; tidak bisa memodifikasi variabel final
    }
}

class Sepeda{
    int getBan(){
        return 2;
    }

    final void berjalan(){
        System.out.println("Berjalan menggunakan roda");
    }
}

class Honda extends Sepeda{
    int getBan(){
        return 2+1;
    }

    /*
    void berjalan(){
        System.out.println("Berjalan menggunakan roda");
    }

    untuk final method tidak bisa dioverride
     */
}

/*
class Tesla extends Mobil{

}

Tidak bisa me-inherit final class
 */
