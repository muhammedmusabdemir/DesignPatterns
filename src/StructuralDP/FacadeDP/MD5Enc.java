package StructuralDP.FacadeDP;

public class MD5Enc {

    public void encrypt(String text,String key,boolean complex){
        if (complex){
            System.out.println("<SHA>***" + text + key + "***</SHA>");
        }else {
            System.out.println("<SHA>" + text + key + "</SHA>");
        }

    }
}
