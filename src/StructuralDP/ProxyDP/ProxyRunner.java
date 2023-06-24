package StructuralDP.ProxyDP;

public class ProxyRunner {

    public static void main(String[] args) {

        RealImageClass realObject = new RealImageClass("C:\\resim1.jpeg");  //resim yukleniyor.
        //realObject.changeFormat();

        System.out.println("------------ Proxy Object -----------");

        ProxyImageClass proxyObject = new ProxyImageClass("C:\\resim1.jpeg"); //resim yuklnemedi, orjinal degil
        //baska islemler.........
        //

        proxyObject.showImage(); //methodu cagrilinca real object olustu.
        //proxyObject. //diger methodlara erisim yok, yani orjinal objenin yonetimini saglamis oluyoruz.


    }
}
