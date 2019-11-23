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
public class Polybius {
    
    private char[][] matrix = {{'a','b','c','ç','d','e','f','g'},{'ğ','h','ı','i','j','k','l','m'}
                    ,{'n','o','ö','p','r','s','ş','t'},{'u','ü','v','y','z','q','w','x'}};
    
    public String encryption(String input){
        String res="";
        input=input.toLowerCase();
        for (int i = 0; i < input.length();i++) {
            res+= turnPolybius(input.charAt(i));
        }
        return res;
    }
    public String decryption(String input){
        String res="";
        input=input.toLowerCase();
        String[] tab=input.split(" ");
        
        for(int i=0;i<tab.length;i++){
            if(i!=0)
                res+="";
            for(int j=0; j< tab[i].length();j+=2)
                res+= unturnPolybius(tab[i].substring(j,j+2));
        }
        return res;
    }
    
    private char unturnPolybius(String input){
        if(input.equals(""))
            return ' ';
        else
            return matrix[Integer.parseInt(input.substring(0,1))-1][Integer.parseInt(input.substring(1,2))-1];
    }
    
    private String turnPolybius(char c){
        String num="";
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;i++){
                if(c==matrix[i][j]){
                    num= String.valueOf(i+1)+String.valueOf(j+1);
                    break;
                }else if(c == ' ')
                    num = String.valueOf(c);
            }
        }
        return num;
    }
    
}
