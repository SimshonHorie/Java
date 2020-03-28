
/**
 * Escreva a descrição da classe ClasseConta aqui.
 * 
 * @author (Simshon) 
 * @version (número de versão ou data)
 */
public class ClasseConta
{
    public static void main(String[] args){
        
    

        double salario_hora = 30;
        double salario_bruto = 0;
        double INSS = 0;
        double IR = 0;
        int horas_trab= 950;
        int dependentes = 15;

        double salario_liq;
        salario_bruto = horas_trab * salario_hora + (50 * dependentes);
        
        if(salario_bruto <= 1000){
            INSS = salario_bruto * 8.5 / 100;
            
            
        }else if (salario_bruto > 1000){
            INSS = salario_bruto * 9 / 100;
            
            
        }else if (salario_bruto <= 500){
            System.out.println("Não terá imposto de renda");
            
        }
        
            System.out.println("Seu INSS é: " + INSS);
        
        if (salario_bruto > 500 && salario_bruto <= 1000){
            IR = salario_bruto * 5 / 100;
            
        }else if (salario_bruto > 1000){
            IR = salario_bruto * 7 / 100;
            
        }else{
            System.out.println("Não tem salário");
        
        }
           
            System.out.println("Seu IR é: " + IR);

            salario_liq = salario_bruto - INSS - IR;
            System.out.println("Seu salario é: " + salario_liq);
            
    }
     
}
