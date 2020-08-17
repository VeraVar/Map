package ru.netology.manager;

import java.util.*;

public class FileOpenManager {
    private Map<String, String> map = new HashMap<>();

    public void registerApp(String key, String value){
        map.put(key.toLowerCase(), value);
    }

    public String getNameApp(String key){
        return map.get(key.toLowerCase());
    }

    public void deleteApp(String key){
        map.remove(key.toLowerCase());
    }

    public Set<String> findAllFileNameExtensions(){
        return map.keySet();
    }

    public Set<String> findAllApps(){
        return new HashSet<>(map.values());
    }
}
