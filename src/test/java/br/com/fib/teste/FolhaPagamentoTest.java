package br.com.fib.teste;

import br.com.fib.model.Salario;
import br.com.fib.model.negocio.FolhaPagamento;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FolhaPagamentoTest {
 
    private Salario salario;
    private FolhaPagamento folhaPagamento;
    
    @Before
    public void init()
    {
        salario = new CriaSalario().paraDependente(2).paraQtdHorasTrabalhada(200).paraSalarioHora(5).getSalario();
        folhaPagamento = new FolhaPagamento();
    }
    
    @After
    public void end()
    {
        System.out.println("teste");
    }
    
    @Test
    public void calculaSalarioBruto()
    {
        double salarioBruto = folhaPagamento.salarioBruto(salario);
        System.out.println("Salario: " + salarioBruto);
        assertEquals(1100.0, salarioBruto, 0.1);
    }
    
    
    @Test 
    public void calculaInss()
    {
        double inss = 0;
        inss = folhaPagamento.descontoInss(salario);
        System.out.println("Inss: "+ inss);
        assertEquals(99.0, inss, 0.0);
    }
   
    @Test
    public void calculaIr()
    {
        double ir = 0;
        ir = folhaPagamento.descontoIR(salario);
        System.out.println("Ir: " + ir);
        assertEquals(77.00000000000001, ir, 0.0);
    }
    
    @Test
    public void calculaSalarioLiquido()
    {
        double salarioLiquido = folhaPagamento.salarioLiquido(salario);
        System.out.println(salarioLiquido);
        assertEquals(924.0, salarioLiquido, 0.0);
    }
    
    
}