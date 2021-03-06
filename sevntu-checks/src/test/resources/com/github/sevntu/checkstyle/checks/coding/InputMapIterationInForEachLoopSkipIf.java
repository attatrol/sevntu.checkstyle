package com.github.sevntu.checkstyle.checks.coding;
import com.github.sevntu.checkstyle.checks.coding.MyMap;
import java.util.*;
import java.util.Map.Entry;

public class InputMapIterationInForEachLoopSkipIf
{
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<String, String>();
        MyMap<String, String> myMap = new MyMap<String, String>();

        int counter = 0;
        for (String key : map.keySet())
        {
            map.get(key);
            if (counter != 0) {
                System.out.println(key);
            }
        }
        
        for (String key : map.keySet())
        {
            System.out.println(key);
            if (counter != 0) {
                System.out.println(map.get(key));
            }
        }
        
        for (String key : map.keySet())
        {
            if (counter != 0) {
                System.out.println(map.get(key));
            }
        }
        
        for (String key : map.keySet())
        {
            if (counter != 0) {
                System.out.println(key + " --> " + map.get(key));
            }
        }

        for (MyMap.Entry<String, String> entry : myMap.entrySet())
        {
            System.out.println(entry.getKey());
            if (entry.getValue() != "value") {
                System.out.println(entry.getValue() + " --> ");
            }
        }
        
        Map<String, String> tableToUpdater = new HashMap<String, String>();
        
        for (Entry<String, String> entry : tableToUpdater.entrySet()) {
            String updater = entry.getValue();
            if (updater instanceof Object) {
                System.out.println(entry.getKey() + "-updater" + updater);
            }
        }
    }
}
