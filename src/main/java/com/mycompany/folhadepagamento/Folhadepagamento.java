
package com.mycompany.folhadepagamento;

import java.util.Scanner;
public class Folhadepagamento {

    public static void main(String[] args) {
        Folha2 f = new Folha2();
        
        Scanner leia1 = new Scanner(System.in);
        System.out.println("Digite o valor da sua hora trabalhada: ");
        f.hora = leia1.nextDouble();
        
        Scanner leia2 = new Scanner(System.in);
        System.out.println("Digite quantas horas foram trabalhadas: ");
        f.valorh = leia2.nextDouble();
       f.saida();
    }
}
