package com.mycompany.calculodearea;
import java.util.Scanner;


public class CalculoDeArea {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
       
        System.out.println("Calcule a Area");
        System.out.println("Digite um valor para a base: ");
        double base = input.nextDouble();
        
        System.out.println("Digite um valor para a alutra: ");
        double altura = input.nextDouble();
        
        
        CalcularArea  calcular = new CalcularArea();
        double resultadoCalcula = calcular.calculoArea(base,altura);
        
        System.out.println("a area da base e altura fornecida é: "+ resultadoCalcula);
        
    }
}

 class CalcularArea{
    public double calculoArea(double base, double altura){
        double resultado = base*altura;
        return resultado;
    }

}
