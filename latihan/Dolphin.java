
package Praktikum10.latihan;

class Animal{}
class Mammal extends Animal{}
class Cat extends Animal{}
public class Dolphin extends Mammal{
    
    public static void main(String[] args){
        Mammal m = new Mammal();
        Animal a = m;
        Dolphin d = (Dolphin) a;
    }
}

//baris 10 object new Cat diganti new Mammal