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
//NIM/ No : 2041720018
//Kelas   : TI 1H
 */
import java.util.Scanner;
public class MainSepedaMotor {
    Scanner sc = new Scanner(System.in);
    SepedaMotor[]spdmtr = new SepedaMotor[4];
    
    public static void main(String[] args) {
        System.out.println(" ___________________________");
        System.out.println("|     DAFTAR PEMILIHAN      |");
        System.out.println("|___________________________|");
        SepedaMotor[]spdmtr = new SepedaMotor[4];
        spdmtr[0]= new SepedaMotor("~~~~HONDA~~~~");
        spdmtr[1]= new SepedaMotor("~~~~YAMAHA~~~~");
        spdmtr[2]= new SepedaMotor("~~~~DUCATI~~~~");
        spdmtr[3]= new SepedaMotor("~~~~SUZUKI~~~~");
    
    }
    
}
