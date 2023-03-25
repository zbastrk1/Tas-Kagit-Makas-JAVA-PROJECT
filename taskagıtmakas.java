package org.example;

import java.util.Scanner;

public class taskagıtmakas {
    public static void main (String[]args){
        Scanner klavye = new Scanner(System.in);
        int kullanıcıpuan=0;
        int bilgisayarpuan=0;
        int secim=0;
        int bilsecim=0;
        System.out.println(".... TAŞ KAGIT MAKAS OYUNUNA HOŞGELDİNİZ ....");
        System.out.println("1- TAŞ \n" +
                              "2- KAGIT \n" +
                                 "3- MAKAS ");

        while(true){
            System.out.println("Lütfen Seçiminizi Yapınız : ");
            secim=klavye.nextInt();
            bilsecim= (int)(Math.random()*3);


            if(secim==1 && bilsecim==1 || secim==2 && bilsecim==2 || secim==3 && bilsecim==3){
                System.out.println("Kullanıcı Seçimi : " +secim );
                System.out.println("Bilgisayar Seçimi : " + bilsecim);
                System.out.println("Durum Berabere : ");

            }
            else if(secim==2 && bilsecim==1 || secim==3 && bilsecim==2 || secim==1  && bilsecim==3) {
                System.out.println("Kullanıcı Seçimi : " +secim );
                System.out.println("Bilgisayar Seçimi : " + bilsecim);
                System.out.println(" Kullanıcı Kazandı : ");
                kullanıcıpuan++;

            }
            else if(secim==1 && bilsecim==2 || secim==2 && bilsecim==3 || secim==3 && bilsecim==1){
                System.out.println("Kullanıcı Seçimi : " +secim );
                System.out.println("Bilgisayar Seçimi : " + bilsecim);
                System.out.println(" Bilgisayar Kazandı : ");
               bilgisayarpuan++;
            }
            else if(kullanıcıpuan==3 || bilgisayarpuan==3){
                System.out.println("Oyun Bitti ");
                System.out.println("Kullanıcı Puanı : " +kullanıcıpuan);
                System.out.println("Bilgisayar Puanı : " +bilgisayarpuan);break;
            }

        }

    }
}
