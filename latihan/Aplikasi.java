
package Praktikum10.latihan;

class Induk{
    Induk(){}
    protected void Metode1(){
        System.out.println("Induk : Metode 1");
    }
}
class Anak extends Induk{
    Anak(){}
    public void Metode1 (){
        System.out.println("Anak : Metode 1");
    }
}
public class Aplikasi {
    public static void main(String[] args) {
        Induk o = new Anak(); o.Metode1();
    }
}