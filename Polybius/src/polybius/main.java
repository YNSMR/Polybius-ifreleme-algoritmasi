/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polybius;

/**
 *
 * @author Bilgisayar
 */
public class main {
    
    public static void main(String[] args) {
        String plaintext = "polybius algoritması ile metin şifreleme örneği";
        System.out.println("Metnin açık hali : " + plaintext);
        Polybius polybius=new Polybius();
        String result=polybius.encryption(plaintext);
        System.out.println("Metnin şifrelemnmiş hali : " + result);
        result = polybius.decryption(result)  ;
        System.out.println("Metnin çözülmüş hali : " + result);
    } 
    
    
}
