
package com.mycompany.folhadepagamento;

public class Folha2 {
    public double hora, valorh, salariob, salariol, fgts, inss, ir, descontos;
    
    public double calc(){
        salariob = hora * valorh;
        fgts = salariob * 0.11;
        inss = salariob * 0.1;

    if (salariob <= 900){
        ir = 1;
        descontos = (salariob * ir) + (inss);
        salariol = salariob - descontos;
    }
    else if (salariob <= 1500){
        ir = 0.05;
        descontos = (salariob * ir) + (inss);
        salariol = salariob - descontos;
    }
    else if (salariob <= 2500){
        ir = 0.1;
        descontos = (salariob * ir) + (inss);
        salariol = salariob - descontos;
    }
    else { ir = 0.2;
        descontos = (salariob * ir) + (inss);
        salariol = salariob - descontos;
    } return salariol;
    }
            public void saida(){
                calc();
                
                System.out.println("Salário bruto                     : R$ " +salariob);
                System.out.println("( – ) IR (" +(ir * 100) +"%)                   : R$ "+(ir * salariob));
                System.out.println("( – ) INSS ( 10% )                : R$ "+inss);
                System.out.println("FGTS ( 11%)                       : R$" +fgts);
                System.out.println("Total de descontos                : R$ "+descontos);
                System.out.println("Salário Líquido                   : R$ "+salariol);
            }
}
