public class Pekerjaan implements Manusia, Skill{
    public void bernafas() {
        System.out.println("Menggunakan paru-paru");
    }

    public int koordinatY() {
        return 0;
    }

    public int koordinatY(int y) {
        return y + 1234;
    }

    public int koordinatX() {
        return 0;
    }

    public int koordinatX(int x) {
        return x - 1234;
    }

    public int agility() {
        return 100;
    }

    public int intelegence() {
        return 220;
    }

    public int strength() {
        return 120;
    }

    /*
    Multiple implements diizinkan dan method-method pada interface yang diimplements harus
    dioveride
     */
}
