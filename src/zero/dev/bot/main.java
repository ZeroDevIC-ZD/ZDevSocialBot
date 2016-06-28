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

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
/**
 *
 * @authors: AirCool & AirDragon
 */
public class main {
    
    static langLoad langObj;
    
    static String
            langCode="EN";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        MainForm form = new MainForm();
        //if (args[0].equals((Object) "true")) {
            //form.setLanguage(2);
            //form.show();
        //} else {
            System.out.println("ChatBot by ZeroDev => AirTeam started \n Please choose your lang: \n 1)RU \n 2)EN");
            Scanner scan;
            scan = new Scanner(System.in);
            try (FileReader rr = new FileReader("C:\\Users\\vitalia\\ZDevSocialBot\\new.config")) {
                int age = rr.read();
            }
            catch (IOException e){
                FileWriter wr = new FileWriter("C:\\Users\\vitalia\\ZDevSocialBot\\new.config");
                wr.write("18");
                wr.flush();
            }
            if (scan.hasNextInt()) {
                switch (scan.nextInt()) {
                    case 1:
                        langCode="RU";
                        System.out.println("Вы выбрали Русский язык, Здравствуйте");
                        //form.setLanguage(1);
                        break;
                    case 2:
                        langCode="EN";
                        //form.setLanguage(2);
                        break;
                    default:
                        System.out.println("It's non here! Set lang:EN");
                }
                form.show();
                

                //langObj = new langLoad(langCode);
            //}
        }
    }

    boolean isFirstRun() {
        return true;
    }

}
