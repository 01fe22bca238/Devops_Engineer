public class Engineer extends DevopsEngineer {
    int Salary = 70000;
    String name = "Ranjita.H.Illur";
    String Id = "01fe22bca195";

    public void display() {
        System.out.println("Employee Details");
        System.out.println("Name: " + name);
        System.out.println("ID: " + Id);
        System.out.println("Salary: " + Salary);
    }

    public static void main(String[] args) {
        Engineer e = new Engineer();
        e.display();
        e.displaydetails();

    }
}