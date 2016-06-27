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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 *
 * @author AirCool
 * 
 * Description:
 * class for load langPacks;
 */
public class langLoad {
    
    String
            error="Ok",
            file,
            name="name",
            langCode="EN";
    
    public String
            botName;//default bot name on seted lang
    
    JSONParser pars=new JSONParser();
    JSONObject jsonObj;
    Object obj;
    InputStream langFile;
    
    public langLoad(String code){
        langCode=code;
        
        try {
            file = getTranslateFile();
            jsonObj=(JSONObject) pars.parse(file);
        } catch (IOException | ParseException ex) {
            System.out.println("Error! Please say developers about it.");
            error="nullPointerException";
            Logger.getLogger(langLoad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jsonObj.get((Object) name);
    }
    
    public langLoad(){
        error="nonSetedLang!";
        try {
            file = getTranslateFile();
            jsonObj=(JSONObject) pars.parse(file);
        } catch (IOException | ParseException ex) {
            System.out.println("Error! Please say developers about it.");
            error="nullPointerException";
            Logger.getLogger(langLoad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String getTranslateFile() throws FileNotFoundException, IOException{
        langFile = getClass().getResourceAsStream("/lang/" + langCode + ".json");
        BufferedReader reader = new BufferedReader(new InputStreamReader(langFile));
        StringBuilder out = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            out.append(line);
        }
        
        return out.toString();
    }
    
}
