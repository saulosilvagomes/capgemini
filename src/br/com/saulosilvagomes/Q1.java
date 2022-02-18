package br.com.saulosilvagomes;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public void escada(){
        System.out.println("Questão 01");
        ArrayList<String> resultado = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String aux ="";
        int n;
       // System.out.println("Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.");
        System.out.println("Digite n:");
        n = sc.nextInt();

        for(int i = 0;i<n;i++){
            aux = " ".repeat(n - i)+ "*".repeat(i + 1);
            resultado.add(aux);
        }

        for (int i=0;i<resultado.size();i++ ) {
            System.out.println(resultado.get(i));
        }


    }
}
