package com.example.helloworld;

import java.util.Arrays;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");

        System.out.println("Hello, World ggghf" + HaciendoUnmetodo());
        System.out.println("Hello, World ggghf" + HaciendoUnmetodoDiferente());

        EsteEsUnMetodo("Tratando de ver este error de duplicación");
        EsteEsUnMetodoDifente("Tratando de ver este error de duplicación");


    }

    public static int HaciendoUnmetodo(){
        int a =0;
        int B = 2;

        int c = a+B;
        return 0;

    }

    public static int HaciendoUnmetodoDiferente(){

        int a =0;
        int B = 2;

        int c = a+B;
        return 0;

    }


    public  static void EsteEsUnMetodo(String texto){

        List<String> list = Arrays.asList(texto.split(" "));

        String val = "";

        for(String s: list){
            val =val + s;
        }
    }


    public  static void EsteEsUnMetodoDifente(String texto){

        String x = "Otro Texto";

        List<String> list = Arrays.asList(texto.split(" "));

        String val = "";

        for(String s: list){
            val =val + s;
        }

        val = val +x;
    }
}
