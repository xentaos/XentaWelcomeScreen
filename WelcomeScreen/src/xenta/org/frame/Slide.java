/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xenta.org.frame;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;

/**
 *
 * @author andi
 */
public class Slide extends JLabel{
    String gambar[]=new String[]{
        "../img/SLIDE1.png",
        "../img/SLIDE2.png",
        "../img/SLIDE3.png",
        "../img/SLIDE4.png",
        "../img/SLIDE5.png"
            //isi URL gambar2 disini.. pixel harus sama.
    };
    String paragraf[]=new String[]{
        "<html>"
            + "<p>"
            + "Selamat Datang\n" +
"Xenta OS adalah Distro Linux Lokal Indonesia dikembangkan oleh\n" +
"Organisasi non-profit. Yang Bertujuan Sebagai Alternatif Sistem \n" +
"Operasi Bebas, Legal dan Gratis."
            + "</p>"
            + "</html>",
        "<html>"
            + "<p>"
            + "Fitur Baru<br>\n" +
"* Perbaikan Bugs dan Perapihan Paket-Paket.<br>\n" +
"* Edisi LTS dukungan panjang sampai tahun 2021.<br>\n" +
"* Merapihkan Aplikasi Bawan dan Perbaikan Theme.<br>"
            + "</p>"
            + "</html>",
        "<html>"
            + "<p>"
            + "Komunitas\n" +
"Xenta OS memiliki wadah Untuk Berkomunikasi dan Berdiskusi \n" +
"Seputar Linux & Pemecahan Masalah Hardware / Software.\n" +
"Berkomunitas Facebook Group & Telegram Group. "
            + "</p>"
            + "</html>",
        "<html>"
            + "<p>"
            + "Proyek\n" +
"Xenta OS sebuah proyek kerja secara terbuka,\n" +
"yang dikerjakan serius berdasarkan hobi.\n" +
"Lengkapnya Kunjungi http://dev.xentaos.org/ ."
            + "</p>"
            + "</html>",
        "<html>"
            + "<p>"
            + "Kontribusi\n" +
"Xenta OS terbuka bagi siapapun untuk bergabung \n" +
"mengembangkan, berkreasi dan berinovasi dalam sistem operasi.\n" +
"Lengkapnya Kunjungi http://dev.xentaos.org/p/join.html/ ."
            + "</p>"
            + "</html>"
        
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
    public String setParagraf(){
        return this.paragraf[next];
    }
    
    

   
    
    
    
}
