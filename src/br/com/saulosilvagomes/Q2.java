package br.com.saulosilvagomes;

import java.util.Scanner;

public class Q2 {
    public void checaSenha(){

        System.out.println("Questão 02");
        int tamanhoMin = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha:");
        String senha = sc.next();

        int tamanho = senha.length();

        if(tamanho < tamanhoMin){
            int falta = tamanhoMin - tamanho;
            //System.out.println("Senha com "+tamanho+" caracteres. Você deve adicionar mais "+falta+" caracteres!");
            System.out.println(falta);
        }
    }
}
