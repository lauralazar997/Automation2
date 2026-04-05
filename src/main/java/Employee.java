public class Employee {
    String name;
    int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        //double increasedSalary = this.salary + this.salary*percent;
        System.out.println("Cresterea salariala este: " + percent);
        double increasedSalaryValue = this.salary + this.salary*percent;
        System.out.println("Salariul dupa crestere este: " + increasedSalaryValue);
    }

    public void getSalary(){
        System.out.println("Salariul angajatului " + this.name + " este: " + this.salary);
    }

    public static void main(){
        Employee angajatulLunii = new Employee("Emil", 4000);
        Employee unAltAngajat = new Employee("Mara", 3500);
        angajatulLunii.increaseSalary(0.2);
        //angajatulLunii.getSalary();
        unAltAngajat.getSalary();
    }
}
