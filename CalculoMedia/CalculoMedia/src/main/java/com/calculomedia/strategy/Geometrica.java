package com.calculomedia.strategy;

public class Geometrica implements MediaStrategy {
    @Override  // ✅ Indica que estamos implementando um método da interface
    public double calcularMedia(double p1, double p2) {
        return Math.sqrt(p1 * p2);
    }
    
    @Override
    public String verificarSituacao(double media) {
        return media >= 7.0 ? "Aprovado" : "Reprovado";
    }
}
