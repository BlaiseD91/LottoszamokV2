/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lottoszamok;

/**
 *
 * @author Székely Balázs Csaba
 * @date 2022-12-08
 * @version 2.0
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lottoszamok {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] otosSzamok = new int[5];
        int[] hatosSzamok = new int[6];
        int randomSzam =0, i = 0;
        int felsoHatar, alsoHatar = 1;
        boolean vanIlyen = false;
        String valasz, hatosStr = "6", otosStr = "5", mindkettoStr = "mindketto";
        
        //tippválasztó
        System.out.println("Milyen tippet szeretnél generálni (5/6/mindketto)");
        valasz = br.readLine();
        // Ötöslottó tipp 
        if (valasz.equals(otosStr) || valasz.equals(mindkettoStr)) {
            felsoHatar = 90;
            do {
                randomSzam = (int) (Math.random() * (felsoHatar - alsoHatar) + alsoHatar);

                for (int j = 0; j <= i; j++) { // nézzük meg van-e már ilyen szám
                    if(otosSzamok[j] == randomSzam){
                        vanIlyen = true;
                        break;
                    }
                }
                if (!vanIlyen) {
                    otosSzamok[i] = randomSzam;
                    i++;
                }
                else
                    vanIlyen = false;
            }while( i <otosSzamok.length);

            System.out.print("Ötöslottó tipp: ");
            for (int j = 0; j < otosSzamok.length; j++)
                System.out.print(otosSzamok[j] + "; ");
        }
        
        // Hatoslottó tipp 
        if ( valasz.equals(hatosStr) || valasz.equals(mindkettoStr)) {
            felsoHatar = 45;
            i = 0;
            do {
                randomSzam = (int) (Math.random() * (felsoHatar - alsoHatar) + alsoHatar);

                for (int j = 0; j <= i; j++) { // nézzük meg van-e már ilyen szám
                    if(hatosSzamok[j] == randomSzam){
                        vanIlyen = true;
                        break;
                    }
                }
                if (!vanIlyen) {
                    hatosSzamok[i] = randomSzam;
                    i++;
                }
                else
                    vanIlyen = false;
            }while( i <hatosSzamok.length);

            System.out.print("\nHatoslottó tipp: ");
            for (int j = 0; j < hatosSzamok.length; j++)
                System.out.print(hatosSzamok[j] + "; ");
        }

        
        

    }
}
