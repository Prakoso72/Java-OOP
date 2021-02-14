public class Main {
    public static void main(String[] args) {

        /*
        Cara Normal
        HelLo variable = new ImplementsClass();
         */

        //anonymous class
        Hello andy = new Hello(){
            @Override
            public void hello() {
                System.out.println("Hello");
            }

            public void hello(String name){
                System.out.println("Hello" + name);
            }
        };

        //anonymous class
        Hello andi = new Hello(){
            @Override
            public void hello() {
                System.out.println("Halo");
            }

            public void hello(String name){
                System.out.println("Halo" + name);
            }
        };

        andy.hello();
        andi.hello();
    }
}
