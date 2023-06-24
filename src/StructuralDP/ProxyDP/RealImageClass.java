package StructuralDP.ProxyDP;

public class RealImageClass implements ImageGenerator{

    public String fullpath;


    //parametreli constructor
    public RealImageClass(String fullpath) {
        this.fullpath = fullpath;
        loadImage(); //obje olusuturuldugunda resim databaseden yuklensin
    }

    @Override
    public void showImage() {
        System.out.println("resim gosteriliyor... path: " + this.fullpath);
    }

    public void loadImage(){
        System.out.println("resim yukleniyor.");
    }

    //ekstra diger metodlar
    public void changeFormat(){
        //bu bagimli baska objeler
    }

}
