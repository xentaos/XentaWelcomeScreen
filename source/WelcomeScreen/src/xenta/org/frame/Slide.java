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
            + ""
            + "Selamat Datang<br>\n"
            + "<p>" +           
"Xenta OS adalah Distro Linux Lokal Indonesia dikembangkan oleh<br>\n" +
"Organisasi non-profit. Yang Bertujuan Sebagai Alternatif Sistem <br>\n" +
"Operasi Bebas, Legal dan Gratis.<br>"
            + "</p>"
            + "</html>",
        "<html>"
            + ""
            + "Fitur Baru<br>\n"
            + "<p>" +
"* Perbaikan Bugs dan Perapihan Paket-Paket.<br>\n" +
"* Edisi LTS dukungan panjang sampai tahun 2021.<br>\n" +
"* Merapihkan Aplikasi Bawan dan Perbaikan Theme.<br>"
            + "</p>"
            + "</html>",
        "<html>"
            + ""
            + "Komunitas<br>\n"
            + "<p>" +
"Xenta OS memiliki wadah Untuk Berkomunikasi dan Berdiskusi<br> \n" +
"Seputar Linux & Pemecahan Masalah Hardware / Software.<br>\n" +
"Berkomunitas Facebook Group & Telegram Group.<br> "
            + "</p>"
            + "</html>",
        "<html>"
            + ""
            + "Proyek<br>\n"
            + "<p>" +
"Xenta OS sebuah proyek kerja secara terbuka,<br>\n" +
"yang dikerjakan serius berdasarkan hobi.<br>\n" +
"Lengkapnya Kunjungi http://www.xentaos.com/ .<br>"
            + "</p>"
            + "</html>",
        "<html>"
            + ""
            + "Kontribusi<br>\n"
            + "<p>" +
"Xenta OS terbuka bagi siapapun untuk bergabung<br> \n" +
"mengembangkan, berkreasi dan berinovasi dalam sistem operasi.<br>\n" +
"Lengkapnya Kunjungi http://www.xentaos.com/p/join.html/ .<br>"
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
