public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Company.Employe employe = company.new Employe();
        employe.setCompany("Tesla");
        System.out.println(employe.getCompany());
        //Company.Employe employe = new Company.Employe(); error
        //Company.Employe employe = new Employe(); error
        //Tidak bisa deklarasi langsung ke inner class
    }
}

class Company{
    private String name;

    class Employe{
        private String name;

        String getCompany(){
            return Company.this.name;
        }

        void setCompany(String nameCompany){
            Company.this.name = nameCompany;
        }
            /*
            Dengan inner class, maka memungkinkan class untuk mengakses field
            outer classnya
             */
    }
}