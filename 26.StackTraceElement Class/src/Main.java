public class Main {
    public static void main(String[] args) {
        try {
            sampleError();
        } catch (Exception exception){
            StackTraceElement[] stackTraceElements = exception.getStackTrace(); //bentuk array

            exception.printStackTrace(); //bentuk simple printl
        }
    }

    static void sampleError(){
        try{
            int[] ar ={1,2,3};
            System.out.println(ar[3]);
        } catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
