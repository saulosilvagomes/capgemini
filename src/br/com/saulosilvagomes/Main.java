package br.com.saulosilvagomes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int questao=0;
        System.out.println("Digite a questão a ser apresentada:");
        questao = sc.nextInt();
        switch(questao){
            case 1: Q1 q1 = new Q1();
                    q1.escada();
                break;
            case 2: Q2 q2 = new Q2();
                    q2.checaSenha();
                break;
            case 3: Q3 q3 = new Q3();
                    q3.contaAnagramas();
                break;
            default: System.out.println("Questão deve ser 1, 2 ou 3.");
                break;
        }
    }
}
