class Parent{
    String name= "Parent";

    void tes(){
        System.out.println("it is parrent class");
    }
}

class Child extends Parent{
    String name= "Child";

    void tes(){
        System.out.println("it is child class");
    }
}

class Main{
    public static void main(String[] args) {
        var human1 = new Parent();
        human1 = new Child(); //method diambil dari sini
        Child humnan1Child = (Child) human1;
        humnan1Child.tes(); //method tergantung deklarasi objectnya
        System.out.println(humnan1Child.name); //variabel hiding karena cast ke child

        var human2 = new Child(); //method diambil dari sini
        Parent humnan2Parent = human1;
        humnan2Parent.tes(); //method tergantung deklarasi objectnya
        System.out.println(humnan2Parent.name); //variabel hiding karena cast ke parent
    }
}
