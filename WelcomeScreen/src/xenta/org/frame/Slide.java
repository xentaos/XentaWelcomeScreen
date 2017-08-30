/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xenta.org.frame;

/**
 *
 * @author andi
 */
public class Slide {
    String gambar[]=new String[]{
        "../img/s.jpeg",
        "../img/Xentaos.jpg",
        "../img/njay.jpeg"
            //isi URL gambar2 disini.. pixel harus sama.
    };
    int next=0;
    public void setNext(int next){
        this.next=next;
    }
    public boolean isImageMentok(){
        return gambar.length+1>next;
    }
    public String getGambar(){
        
        return this.gambar[next];
    }
    
    
}
