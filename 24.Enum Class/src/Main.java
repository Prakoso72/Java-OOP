import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Disk.MAGNETICDISK);
        System.out.println(Disk.MAGNETICDISK.getSpeed());

        String diskName = Disk.MAGNETICDISK.name(); //enum to String

        Disk disk = Disk.valueOf("SSD"); //String to enum. String harus sama dengan member enum
        System.out.println("\nSSD speed: " + disk);

        Disk[] disks = Disk.values(); //.values() method untuk konversi ke array
        System.out.println("\ndisks:\n" + Arrays.toString(disks));

    }
}
