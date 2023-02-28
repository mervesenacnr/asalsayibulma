public class asalsayibulma {

    //1den 1000e kadar asal sayıları bulmaya çalışacağız.
    //Asal yanının tanımı: yalnızca kendilerine ve 1'e bölünebilen sayılardır.
    
    /*
    Metodlarla bu programı açıklıyorum:
    1- Asal sayıların yalnızca kendileri ve 1'e bölümünden kalan 0'dır.
    Öyleyse burdan bir pseudo kod çıkartırız : sayi % i (for döngüsüyle artar 1000'e kadar i++) ==0 false olmalı
    False olmalı ki o sayının asal olmadığını programa kodlayalım.
    2- 1. işlem kümesinin dışındaki kümeye true demeliyiz ki asalları bulalım.
    3-bir kod bloğuna true ve false fonksiyonunu oluşturduktan sonra main kod bloğumuza 
    sayıları 1'den 1000'e kadar yazdırmamız gerektiğini for döngüsüyle kodlayalım
    4-son yazdığımız for döngüsünün içine if(true) kullanarak asalmi değil mi diye oluşturduğumuz kod bloğunu
    çağıralım 
    5-Böylece if döngüsünün içine çağırdığımız kod bloğu: 2den başlayıp 1000'e kadar giderken asal mı değil mi
    diye kontrol ettiğinde, asal olduğunu görünce true dönecek, true döndüğünde fonksiyon çalışıp ekrana yazdıracak.
    */
    
    
    public static boolean asalmi(int sayi){
    
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0) {
                return false;
            }
        }
        return true;
    }
  
    
    
    public static void main(String[] args) {
       
        System.out.println("Asal sayılar: ");
        
        for (int i = 2; i <= 1000; i++) {
            if (asalmi(i)) {
                System.out.println(i);
                
            }
            
        }
    }
    
}
