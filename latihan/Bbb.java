
package Praktikum10.latihan;
class QOTD161 {
    int xxx;
    void yyy() {xxx=1;}
}

class Bbb extends QOTD161{
    final Bbb finalref = new Bbb();
    
    final void yyy(){
        System.out.println("method yyy");
        finalref.xxx = 12345;
    }
    

}

//baris 3 modifier final diganti default