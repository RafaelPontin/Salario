package br.com.fib.model.negocio;

import br.com.fib.model.Salario;

public class FolhaPagamento {
    
    
    public double salarioBruto(Salario salario)
    {
        return (salario.getHoraValor() * salario.getQtdHorasTrabalhada()) + (50 * salario.getNumeroDependente());
    }
        
    public double descontoInss(Salario salario)
    {
        double salarioBruto = salarioBruto(salario);
        return  salarioBruto <= 1000 ? salarioBruto * 0.085 : salarioBruto * 0.09;
    }
    
    public double descontoIR(Salario salario)
    {
        double salarioBruto = salarioBruto(salario);
        double ir = 0;
        if (salarioBruto > 500 && salarioBruto <= 1000)
        {
            ir = salarioBruto * (0.05);
        }
        if(salarioBruto > 1000)
        {
            ir = salarioBruto * (0.07);
        }
        return ir;
    }
    
    public double salarioLiquido(Salario salario)
    {
        return salarioBruto(salario) - descontoInss(salario) - descontoIR(salario);
    }
    
}
