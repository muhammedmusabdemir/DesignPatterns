package StructuralDP.FacadeDP;

public class FacadeRunner {

    public static void main(String[] args) {

        String text="Design Pattern";

        AESEnc aesEnc = new AESEnc();
        aesEnc.encrypt(text);

        SHAEnc shaEnc = new SHAEnc();
        shaEnc.encrypt(text,"techpro");

        MD5Enc md5Enc = new MD5Enc();
        md5Enc.encrypt(text,"techpro",true);

        //---------------------------------------------

        //bir arayuz olsa sadece kullanmak istedigimiz algoritmayi secsek
        //encrypt metodunun detayi ile ilgilenmeden metodu kullanabilsek

        System.out.println("-------------------- FACADE ---------------------");

        EncryptorFacade encryptor = new EncryptorFacade();
        encryptor.encrypt(text,EncryptType.AES);
        encryptor.encrypt(text,EncryptType.MD5);


    }
}
