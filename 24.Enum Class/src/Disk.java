public enum Disk {
    SSD(3),
    MAGNETICDISK(2),
    OPTICALDISK(1);
    //constructor harus diisi

    private int speed;
    private String name;

    private Disk(int speed){
        this.speed = speed;
    }
    //constructor hanya dapat diakses pada class enum sendiri, sehingga sifatnya private

    public int getSpeed() {
        return speed;
    }

}
