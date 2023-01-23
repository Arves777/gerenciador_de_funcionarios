package Testes;
public class Employeer {
    private String nome;
    private double grossSalary;
    private double tax;
    private int cont = 1;
    
    public double netSalary(){
        double ns = grossSalary - tax;
        return ns;
    }
    
    public void increaseSalary(double percentage){
       grossSalary += (grossSalary * (percentage / 100));
    }
    
    public void data(){
        if (cont == 1){
            System.out.println("Employee Data: " + getNome() + "R$ " + netSalary());
        }else{
            System.out.println("Update Employee Data: "+ getNome() + "R$ " + netSalary());
        }
        setCont(cont += 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
}
