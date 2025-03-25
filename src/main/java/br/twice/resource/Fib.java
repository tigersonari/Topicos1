package br.twice.resource;

public class Fib {
    int fib(int posicao){
        if (posicao <= 1) return posicao;
        return fib(posicao - 1) + fib(posicao - 2);
    }
}
