package com.company;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę kolumn");
	int liczbaKolumn = scan.nextInt();
        System.out.println("Podaj liczbę wierszy");
	int liczbaWierszy = scan.nextInt();
	for(int i=1;i<=liczbaKolumn;i++){
        System.out.print("\n");
	   for(int j=1;j<=liczbaWierszy;j++){
           System.out.print(j*i+"\t");
       }
    }
    }
}
