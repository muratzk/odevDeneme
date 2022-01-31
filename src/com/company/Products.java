package com.company;

public class Products {

   private double pepsi = 5;
   private String pepsi1 = "1.Pepsi";
   private double tea = 3;
   private double su = 1.5;
   private double soda = 2;
   private double icetea = 4;
   private double latte = 6;
   private double sandwich = 7;
   private double halley = 2;
   private double sprite = 5;
   private double cappy = 3.5;
   private double price;
   private int urunNo;
   private String urunAd;

   public double getPepsi() {
      return pepsi;
   }

   public void setPepsi(double pepsi) {
      this.pepsi = pepsi;
   }
   public String getPepsi1() {
      return pepsi1;
   }

   public void setPepsi1(String pepsi1) {
      this.pepsi1 = pepsi1;
   }
   public double getTea() {
      return tea;
   }

   public void setTea(double tea) {
      this.tea = tea;
   }

   public double getSu() {
      return su;
   }

   public void setSu(double su) {
      this.su = su;
   }

   public double getSoda() {
      return soda;
   }

   public void setSoda(double soda) {
      this.soda = soda;
   }
   public double getIcetea() {
      return icetea;
   }
   public void setIcetea(double icetea) {
      this.icetea = icetea;
   }

   public double getLatte() {
      return latte;
   }

   public void setLatte(double latte) {
      this.latte = latte;
   }

   public double getSandwich() {
      return sandwich;
   }
   public void setSandwich(double sandwich) {
      this.sandwich = sandwich;
   }

   public double getHalley() {
      return halley;
   }

   public void setHalley(double halley) {
      this.halley = halley;
   }

   public double getSprite() {
      return sprite;
   }
   public void setSprite(double sprite) {
      this.sprite = sprite;
   }

   public double getCappy() {
      return cappy;
   }
   public void setCappy(double cappy) {
      this.cappy = cappy;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public int getUrunNo() {
      return urunNo;
   }

   public void setUrunNo(int urunNo) {
      this.urunNo = urunNo;
   }

   public String getUrunAd() {
      return urunAd;
   }

   public void setUrunAd(String urunAd) {
      this.urunAd = urunAd;
   }
   @Override
   public String toString() {
      return "Products: \n1.Pepsi= "+pepsi+" TL"+"\n2.Çay= "+tea+"TL"+"\n3.Su= "+su+"TL"+"\n4.Soda= "+soda+"TL"+"\n5.Isetea= "+icetea+"TL"
              +"\n6.Latte= "+latte+" TL"+"\n7.Sandwich= "+sandwich+" TL"+"" + "\n8.Halley= "+halley+" TL"+"\n9.Sprite= "+sprite+" TL"+"\n10.Cappy= "+cappy+" TL";
   }

}