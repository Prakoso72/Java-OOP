public class ErrorError extends Error {
    ErrorError(String massage){
        super(massage);
    }

    /*
    Error yang paling fatal menggunakan exception ini. Dengan exception ini
    maka aplikasi dapat diberhentikan dan disarankan untuk mematikan aplikasi
    sehingga sangat tidak direkomendasikan menggunakan try catch. Contoh kasusnya
    yaitu error karena gagal konek ke database dan error tersebut tentunya sangatlah
    fatal bagi suatu software
     */
}
