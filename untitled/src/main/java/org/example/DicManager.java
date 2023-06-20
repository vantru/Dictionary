/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tru
 */
public class DicManager {
   public Map<String,ArrayList<String>> GetDic() throws FileNotFoundException, IOException {
        String url = "D:\\Tai lieu\\Java\\PA_01_DictionaryApp\\untitled\\src\\main\\java\\org\\example\\slang.txt";
        FileReader fr=new FileReader(url); 
        BufferedReader bf = new BufferedReader(fr);
        HashMap<String, ArrayList<String>> dic = new HashMap<String,ArrayList<String>>();
        
        int i;
        while((i=bf.read())!=-1){
            String line = bf.readLine();
            String[] arrLine = line.split("`");
            if(arrLine.length == 2){
                 String k = arrLine[0];
                var arrs = GetValueArray(k, arrLine[1]);
                dic.put(k, arrs);
            }
           
        }
        bf.close();
        fr.close();
        return dic;
   }
   public ArrayList<String> GetValueArray(String k,String v){
       ArrayList<String> arrs = new ArrayList<String>();
            String[] arrVS = v.split("\\|");
            if(arrVS.length == 0){
                return arrs;
            }
            for (String arrVS1 : arrVS) {
                arrs.add(arrVS1.trim());
            }
       return arrs;
   }
    
}
