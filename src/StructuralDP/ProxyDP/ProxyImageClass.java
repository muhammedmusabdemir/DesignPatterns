package StructuralDP.ProxyDP;

public class ProxyImageClass implements ImageGenerator{

    private RealImageClass realImageClass;

    public String fullpath;


    public ProxyImageClass(String fullpath) {
        this.fullpath = fullpath;
    }

    @Override
    public void showImage() {

        if (realImageClass==null){ //burada
            this.realImageClass = new RealImageClass(fullpath);
        }
        realImageClass.showImage();

    }

}
