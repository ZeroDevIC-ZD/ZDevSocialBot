/*
 * Copyright 2016 AirCool.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package zero.dev.bot;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @authors: AirCool & AirDragon
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ChatBot by ZeroDev => AirTeam started \n Please choose your lang: \n 1)RU \n 2)EN");
        Scanner scan;
        scan = new Scanner(System.in);
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
            String[] lang;
            try {
                form.show();
                lang = langLoad.getLang("EN");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
