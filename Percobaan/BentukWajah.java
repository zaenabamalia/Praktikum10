/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum10.Percobaan;

/**
 *
 * @author Zaenab
 */
public class BentukWajah {
    public String respons(){
        return("Perhatikan reaksi wajah saya\n");
    }
}

class Senyum extends BentukWajah{
    public String respons(){
        return("Senyum karena senang\n");
    }
}

class Tertawa extends BentukWajah{
    public String respons(){
        return("Tertawa karena gembira\n");
    }
}

class Marah extends BentukWajah{
    public String respons(){
        return("Kemarahan disebabkan bertangkar\n");
    }
}

class Sedih extends BentukWajah{
    public String respons(){
        return("Sedih disebabkan Cemburu\n");
    }
}
