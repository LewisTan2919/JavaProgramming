package StructuralPattern.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
   private static Map<String,TreeType>map=new HashMap<>();

   public static TreeType getTreeType(String color,String texture){
       String key=color.concat("_"+texture);
       if(!map.containsKey(key)){
           map.put(key,new TreeType(color,texture));
       }
       return map.get(key);
   }

}
