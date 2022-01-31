package com.company;

import java.util.Scanner;

public class Main {
double accountHesaplama;
public static void main(String[] args){}
public double select(Products product){
   System.out.println(product.toString());
  /*  urun market = new urun();
  System.out.println(product.getPepsi1()+" "+ product.getPepsi() + " TL");
   System.out.println("2.Çay " + product.getTea() + " TL");
   System.out.println("3.Su " + product.getSu() + " TL");
   System.out.println("4.Soda " + product.getSoda() + " TL");*/

   Scanner scan = new Scanner(System.in);
  do{
  System.out.println("Lütfen Satın Alacağınız Ürünün Numarasını Giriniz ");
  System.out.println("Çıkış için 0 ");
  product.setUrunNo(scan.nextInt());
  if(product.getUrunNo()<0 || product.getUrunNo()>10){
      System.out.println("Lütfen Geçerli Bir Sayı Giriniz!!!");
  }

  }while(product.getUrunNo()<0 || product.getUrunNo()>10);

  switch (product.getUrunNo()){
      case 0:
          System.out.println("Ürün Almadan Çıkış Yapıyorsunuz, Tekrar Bekleriz ");
          break;

      case 1:
          product.setPrice(product.getPepsi());
          break;

      case 2:
          product.setPrice(product.getTea());
          break;

      case 3:
          product.setPrice(product.getSu());
          break;

      case 4:
          product.setPrice(product.getSoda());
          break;

      case 5:
          product.setPrice(product.getIcetea());
          break;

      case 6:
          product.setPrice(product.getLatte());
          break;

      case 7:
          product.setPrice(product.getSandwich());
          break;

      case 8:
          product.setPrice(product.getHalley());
          break;

      case 9:
          product.setPrice(product.getSprite());
          break;

      case 10:
          product.setPrice(product.getCappy());
          break;
      }
      return product.getPrice();
 }

    public double hesaplama(double price, double accountHesaplama, Products product) {
        double funds;


        while (accountHesaplama<price){
            Scanner scan = new Scanner(System.in);
            System.out.println("Ürün için bakiyeniz yetersiz..., Bakiye eklemek istiyormusunuz? E/H");
            char confirm = scan.next().toLowerCase().charAt(0);

            if(confirm == 'h') {
                System.out.println("Kalan Bakiyeniz :" + accountHesaplama);
                System.out.println("Alışverişiniz için teşekkürler");
                break;
            }else {
                System.out.println("Ne kadar eklemek istersiniz :");
                funds = scan.nextDouble();
                accountHesaplama = accountHesaplama + funds;
                System.out.println("Bakiyeniz :" + accountHesaplama);
                price = select(product);
            }

        }

        return accountHesaplama;

 }

     public void purchase(double price, double accountHesaplama, Products product) {
     while(accountHesaplama>=price) {

         accountHesaplama = accountHesaplama - price;
         System.out.println("Kalan Bakiyeniz :" + accountHesaplama);
         Scanner scan = new Scanner(System.in);
         System.out.println("Başka bir ürün almak ister misiniz? E/H");
         char confirm = scan.next().toLowerCase().charAt(0);

         if(confirm == 'h') {
             System.out.println("Teşekkürler Tekrar bekleriz");
             break;
         }else {
             product.setPrice(select(product));
             accountHesaplama = hesaplama(product.getPrice(), accountHesaplama, product);

         }
     }

    }
}