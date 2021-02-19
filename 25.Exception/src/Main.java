

/*
Exception terdiri dari 3 jenis, yaitu:
* Checked Exception
* Runtime Exception
* Error
 */

public class Main {
    static void CheckedExc(String username, String password, int indeks)throws CheckedError, NullPointerException, ArrayIndexOutOfBoundsException{
        if(username == null){
            throw new NullPointerException("null useername"); //constructor input massage
        } else if(username.isBlank()){
            throw new CheckedError("username is blank");
        } else if(password == null){
            throw new NullPointerException("null password");
        } else if(password.isBlank()) {
            throw new CheckedError("password is blank");
        }

        int[] naturalNumbers = {1,2,3,4,5,6,7,8,9,999};
        System.out.println("Natural Number " + indeks + ": " + naturalNumbers[indeks]);

    }

    static void runtimeExc(String username, String password){
        if(username == null){
            throw new NullPointerException("null useername"); //constructor input massage
        } else if(username.isBlank()){
            throw new RuntimeError("username is blank");
        } else if(password == null){
            throw new NullPointerException("null password");
        } else if(password.isBlank()) {
            throw new RuntimeError("password is blank");
        }
    }

    static void fatalErrorExc(String username, String password){
        if(username == null || password == null || username.isBlank() || password.isBlank()){
            throw new ErrorError("Tidak bisa konek ke Database, terpaksa aplikasi diberhentikan");
        }
    }

    public static void main(String[] args) {
        System.out.println("Checked Runtime\n");
        try{
            CheckedExc("Hitler","",19);
        } catch (CheckedError | NullPointerException exception){ //exception gabungan menggunakan '|'
            System.out.println("Data : " + exception.getMessage());
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array : " + exception.getMessage());
        } finally {
            System.out.println("it's finally block");
        }


        System.out.println("\nRuntime Exception\n");
        runtimeExc("Franklin D Rosevelt","hapus ini agar terlihat!"); //tanpa try catch

        /*
        pada runtime exception dapat membuat aplikasi mati, sehingga membutuhkan error
        handler yang berisi try catch untuk mengatasi hal tersebut
         */

        System.out.println("\nFatal Error\n");
        fatalErrorExc("", "asd");
    }
}
