/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zero.dev.bot;

import java.util.Scanner;
/**
 *
 * @authors: AirCool & AirDragon
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //потом сделаю (да да потом доделаю девелопер)
        System.out.println("ChatBot by ZeroDev => AirTeam started \n Please choose your lang: \n 1)RU \n 2)EN");
        Scanner scan=new Scanner(System.in);
        if(scan.hasNextInt()){
            MainForm form = new MainForm();
            switch(scan.nextInt()){
                case 1:
                    System.out.println("Вы выбрали Русский язык, Здравствуйте");
                    form.setLanguage(1);
                    break;
                case 2:
                    form.setLanguage(2);
                    break;
                default:
                    System.out.println("It's non here! Set lang:EN");
            }
            form.show();
        }
    }
    
}
