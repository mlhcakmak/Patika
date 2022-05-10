package maashesaplayıcı;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Kemal",2000,45,1985);
        emp1.tax();
        emp1.bonus();
        emp1.raiseSalary();

        emp1.print();


    }
}