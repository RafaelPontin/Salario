package br.com.fib.model;

public class Salario 
{
    private int qtdHorasTrabalhada;
    private double horaValor;
    private int numeroDependente;

    public Salario() {
    }
    
    public int getQtdHorasTrabalhada() {
        return qtdHorasTrabalhada;
    }

    public void setQtdHorasTrabalhada(int qtdHorasTrabalhada) {
        this.qtdHorasTrabalhada = qtdHorasTrabalhada;
    }

    public double getHoraValor() {
        return horaValor;
    }

    public void setHoraValor(double hora) {
        this.horaValor = hora;
    }

    public int getNumeroDependente() {
        return numeroDependente;
    }

    public void setNumeroDependente(int numeroDependente) {
        this.numeroDependente = numeroDependente;
    }
    
}
