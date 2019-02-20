/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xenta.org.frame;

import javax.swing.JLabel;

/**
 *
 * @author andi
 */
public class Slide extends JLabel{
    String gambar[]=new String[]{
        "/xenta/org/img/SLIDE1.png",
        "/xenta/org/img/SLIDE2.png",
        "/xenta/org/img/SLIDE3.png",
        "/xenta/org/img/SLIDE4.png",
        "/xenta/org/img/SLIDE5.png"
            //isi URL gambar2 disini.. pixel harus sama.
    };
    String paragraf[]=new String[]{
        "<html>"
            +"<h1>Selamat Datang</h1>\n"+
"Xenta OS adalah Distro Linux Lokal Indonesia dikembangkan oleh \n" +
"Organisasi non-profit. Yang Bertujuan Sebagai Alternatif Sistem \n" +
"Operasi Bebas, Legal dan Gratis.<br>"
            + "</html>",
        "<html>"
            + "<h1>Fitur Baru</h1>\n"+
"* Perbaikan Bugs dan Perapihan Paket-Paket.<br>\n" +
"* Edisi LTS dukungan panjang sampai tahun 2021.<br>\n" +
"* Merapihkan Aplikasi Bawan dan Perbaikan Theme.<br>"
            + "</html>",
        "<html>"
            + "<h1>Komunitas</h1>\n"+
"Xenta OS memiliki wadah Untuk Berkomunikasi dan Berdiskusi<br> \n" +
"Seputar Linux & Pemecahan Masalah Hardware / Software.<br>\n" +
"Berkomunitas Facebook Group & Telegram Group.<br> "
            + "</html>",
        "<html>"
            + "<h1>Proyek</h1>\n"+
"Xenta OS sebuah proyek kerja secara terbuka,\n" +
"yang dikerjakan serius berdasarkan hobi.<br>\n" +
"Lengkapnya Kunjungi http://www.xentaos.com/ .<br>"
            + "</html>",
        "<html>"
            + "<h1>Kontribusi</h1>\n"+
"Xenta OS terbuka bagi siapapun untuk bergabung\n" +
"mengembangkan, berkreasi dan berinovasi dalam sistem operasi.<br>\n" +
"Lengkapnya Kunjungi http://www.xentaos.com/p/join.html/ .<br>"
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
