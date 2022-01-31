package com.company;

public class Runner {
    public static void main(String[] args){
        double accountHesaplama = 15;
        System.out.println("Otomata Hoşgeldiniz.....");
        System.out.println("Mevcut Bakiyeniz = " + accountHesaplama+" TL");

        Products product = new Products();
        Main method = new Main();


        product.setPrice(method.select(product));
        accountHesaplama = method.hesaplama(product.getPrice(),accountHesaplama,product);

        if (product.getUrunNo() !=0){
            method.purchase(product.getPrice(),accountHesaplama,product);
        }
    }
}
