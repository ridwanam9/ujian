/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ti.java.Activity1;


import org.springframework.stereotype.Controller;


/**
 *
 * @author DELL
 */
@Controller
public class Proses {
    
//    inputdata inda = new inputdata();
    
    int cost;
    public int early_cost(String a, String b){
        int harga_awal;
        
        int inta = Integer.parseInt(a);
        int intb = Integer.parseInt(b);
        
        harga_awal = inta * intb;
        cost = harga_awal;
        return harga_awal;
    }
    
    public int diskon(){
        int dis;
        
        if (cost <= 16000){
            dis = 0 / 100;
        }
        else if( cost > 16000 && cost <= 25000){
            dis = 10 / 100;
        }
        else {
            dis = 15 /100;
        }
        return dis;
    }
    
    public int harga_diskon(){
        int dis_pri;
        
        dis_pri = cost * diskon();
        
        return dis_pri;
    }
    
    public int harga_total(){
        int total_pri;
        
        total_pri = cost - harga_diskon();
        
        return total_pri;
    }    
}
