package pl.sda.javastart2.enums.homeWork;

public class Customer {
    private static int counter=1;
    private int id;
    private String imie;
    private String nazwisko;
    private int wiek;
    private int salary;

    public Customer(int id, String imie, String nazwisko, int wiek, int salary) {
    //    this(imie,nazwisko,wiek,Integer.parseInt(salary));
        //this.id = id;
        //this.imie = imie;
        //this.nazwisko = nazwisko;
        //this.wiek = wiek;
        //this.salary = Integer.parseInt(salary);//"3000" zamieni na liczbe
    }


    public Customer(String imie, String nazwisko, int wiek, int salary) {

        this.id = counter++;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public int getSalary() {
        return salary;
    }

   // @Override
   /* public String toString() {
        return "" "\
        Customer {
            id = $id,
                    imie = '$imie',
                    nazwisko = '$nazwisko',
                    wiek = $wiek,
                    salary = $salary
        } "" "
    }*/
}
