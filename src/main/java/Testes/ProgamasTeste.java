package Testes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ProgamasTeste {
    
    
    public static void main(String[] args) {
        double salary;
        int id;
        String name;
       List<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();        
        for (int i=1; i <n+1; i++){
            System.out.println("Employee #" + i + ":");
            System.out.print("Id: ");
            id = sc.nextInt();
            while(hasId(employees, id)){
                System.out.println("Id Already taken! Try again: ");
                id = sc.nextInt();
            }
            
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Salary: ");
            salary = sc.nextDouble();
            System.out.println("");
            Employee e = new Employee(id, name, salary);
            employees.add(e);
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int resultId = sc.nextInt();
        List<Employee> result = employees.stream().filter(x -> x.getId() == resultId).collect(Collectors.toList());
        if (result.isEmpty()){
            System.out.println("This id does not exist!");
        }else{
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();
        for (Employee x : result){
            x.increaseSalary(percentage);
        }
        }
        System.out.println("");
        System.out.println("List of employees: ");
        for (Employee x: employers){
            System.out.println(x.getId() + ", " + x.getName() + ", " + x.getSalary() );
        }
        sc.close();
        
    
    
    }
    public static boolean hasId(List<Employee> list, int id){
            Employer emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            return emp != null;
        }
}


