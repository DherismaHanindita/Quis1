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
import java.util.Scanner;
public class SepedaMotor {
    String merk;
    boolean kontakMotor;
    int kecepatanMotor;

    SepedaMotor(String honda, double d, int i) {
        }
    
    void SepedaMotor(String merk, boolean kontakMotor, int kecepatanMotor){
        this.merk = merk;
        this.kontakMotor = kontakMotor;
        this.kecepatanMotor = kecepatanMotor;
    }
    static void pemilihan(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ___________________________");
        System.out.println("|     DAFTAR PEMILIHAN      |");
        System.out.println("|___________________________|");
        SepedaMotor game1 = new SepedaMotor("Honda", 2.33, 22);
        VideoGame game2 = new VideoGame(2, 41000, "Adventure");
        VideoGame game3 = new VideoGame(3, 36000, "Real Time Strategi");
        
        game1.pilihan();
        game2.pilihan();
        game3.pilihan();
    
}
