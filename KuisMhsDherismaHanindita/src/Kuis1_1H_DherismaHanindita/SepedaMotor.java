/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1_1H_DherismaHanindita;

/**
 *
 * @author Dherisma
//Nama    : Dherisma Hanindita Utami
//NIM/ No : 2041720018/09
//Kelas   : TI 1H
 */
public class SepedaMotor {
    String merk;
    boolean kontakMotor = false;
    int kecepatanMotor;

    SepedaMotor() {
    }
    
    SepedaMotor(String merk){
        this.merk = merk;
    }
    
    void nyalakanMotor(boolean kontak){
        this.kontakMotor = kontak;
    }
    
    void matikanMotor(boolean kontak){
        this.kontakMotor = kontak;        
    }
    
    void tambahKecepatanMotor(int kec){
        this.kecepatanMotor = kec;
    }
    
    void kurangikecepatanmotor(int kec){
        this.kecepatanMotor = kec;
    }
    
    void info(){
        if (kontakMotor == true) {
            System.out.println("SEPEDA MOTOR YANG ANDA PILIH TELAH DIHIDUPKAN");
        }else{
            System.out.println("SEPEDA MOTOR YANG ANDA PILIH TELAH DIMATIKAN");
        }
        System.out.println("Kec: " +kecepatanMotor);
    }
}