package br.com.fib.teste;

import br.com.fib.model.Salario;

public class CriaSalario {
    
    private Salario salario;

    public CriaSalario() {
        salario = new Salario();
    }
    
    public CriaSalario paraSalarioHora(double salarioHora)
    {
        salario.setHoraValor(salarioHora);
        return this;
    }
    
    public CriaSalario paraQtdHorasTrabalhada(int hora)
    {
        salario.setQtdHorasTrabalhada(hora);
        return this;
    }
    
    public CriaSalario paraDependente(int dependente)
    {
        salario.setNumeroDependente(dependente);
        return this;
    }

    public Salario getSalario() {
        return salario;
    }
    
    
}