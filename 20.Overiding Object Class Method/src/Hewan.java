public class Hewan {
    String name;
    int weight;

    Hewan(String name, int weight){
        this.name = name;
        this.weight = weight;
    }



    /*
    Method toString asli yaitu:
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
     */
    public String toString(){
        return "Hewan: " + this.name + ", Berat: " + this.weight;
    }



    /*
    keyword '==' hanya dapat digunakan untuk tipe data primitif saja, karena jika digunakan
    untuk object, maka perbandiangan atau komparasinya berdasarkan lokasimemory dari kedua
    object yang dibandingkan. Untuk komparasi pada object diperlukan override method equals
    dari object class.
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hewan hewan = (Hewan) o;

        if (weight != hewan.weight) return false;
        return name != null ? name.equals(hewan.name) : hewan.name == null;
    }



    /*
    * HashCode merupakana representasi integer dari object yang unik
    * Secara deafault hashCode akan mengembalikan nilai representasi integer sesuai data
      di memory
    * Sebanyak apapun hashCode dipanggil, object yang sama harus menghasilkan nilai integer
      yang sama
    * Jika komparasi 2 object dengan equals() bernilai true, maka hashcodenya sama
    * Tidak wajib hashCode beda jika equals() menghasilkan false, karena keterbatasan integer
     */
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + weight;
        return result;
    }
}

/*
Untuk override method hashCode dan equals secaras otomatis pada intellij, maka dapat menggunakan
fitur generate pada tab Code
 */
