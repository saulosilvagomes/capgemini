package br.com.saulosilvagomes;

import java.util.*;

public class Q3 {
    public void contaAnagramas(){
        System.out.println("Questão 03");
        int quantidade_anagramas = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a string:");
        String str = sc.next();

        int tamanho = str.length();

        Map<String, Integer> mapa = new HashMap<>();

        for (int i=0; i<tamanho; i++){
            for(int j = i; j < tamanho; j++){
                char[] letras = str.substring(i, j+1).toCharArray();
                Arrays.sort(letras);
                String anagrama = new String(letras);
                if (mapa.containsKey(anagrama))
                    mapa.put(anagrama, mapa.get(anagrama)+1);
                else
                    mapa.put(anagrama, 1);
            }
        }
        for(String key: mapa.keySet()){
            int n = mapa.get(key);
            quantidade_anagramas += (n * (n-1))/2;
        }
        System.out.println(quantidade_anagramas);
        }

    }
