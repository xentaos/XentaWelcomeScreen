/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xenta.org.frame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author andi
 */
public class ExecuteBash {
    private String []perintah={};
    public void setPerintah(String[] perintah) {
        this.perintah = perintah;
    }
    public void eksekusi() throws IOException{
        ProcessBuilder pb=new ProcessBuilder(perintah);
        Process p=pb.start();
        
    }
}
