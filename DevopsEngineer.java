public class DevopsEngineer {

    int Emp_salary = 70000;
    int bouns = 2000;
    int Total;

    public void displaydetails() {
        System.out.println("\nBouns: " + bouns);
        Total = Emp_salary + bouns;
        System.out.println("Total salary with bonus : " + Total);
    }

}
