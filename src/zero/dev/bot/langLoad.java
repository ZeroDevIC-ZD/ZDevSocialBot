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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author AirCool
 * 
 * Description:
 * class for load langPacks;
 */
public class langLoad {
    String error="Ok";
    public JSONParser pars=new JSONParser();
    public InputStream langFile = getClass().getResourceAsStream("/res/lang/RU.json");
    
    public langLoad(String code){
        try {
            String file=getTranslateFile();
        } catch (IOException ex) {
            Logger.getLogger(langLoad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public langLoad(){
        
    }
    
    public String getTranslateFile() throws FileNotFoundException, IOException{
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(langFile));
        StringBuilder out = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            out.append(line);
        }
        
        System.out.println(out.toString());
        System.out.println();
        return out.toString();
    }
    
}
