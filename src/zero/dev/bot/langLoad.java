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

import java.io.File;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author gwarp
 * 
 * Description:
 * class for load langPacks;
 */
public class langLoad {
    
    JSONParser pars=new JSONParser();
    Object костыль;
    File langFile = new File("xml/");
    
    public String[] getLang(String code){
        
        return new String[3];
    }
    
}