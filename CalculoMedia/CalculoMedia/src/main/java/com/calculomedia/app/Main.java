package com.calculomedia.app;

import com.calculomedia.strategy.Aritmetica;

public class Main {
    public static void main(String[] args) {
        int opc;

        MediaStrategy estrategia = new Aritmetica();

        Disciplina d = new Disciplina(estrategia);

        d.setNome("Fulana");
        d.setP1(10);
        d.setP2(5);
        d.calcularMedia();

        System.out.printf("P1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());
}}
