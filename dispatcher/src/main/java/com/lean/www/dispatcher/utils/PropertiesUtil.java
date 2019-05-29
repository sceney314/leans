package com.lean.www.dispatcher.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.*;

/**
 * Copyright (C), 2015-2019
 * Author:   zhengzp
 * Date:     2019/3/26 下午4:07
 * Description:
 */
public class PropertiesUtil {
    private static final Logger log = LoggerFactory.getLogger(PropertiesUtil.class);

    private static Map<String, String> propertiesMap = new HashMap<>();

    static {
        propertiesMap = getAllProperty();
    }

    /**
     * 获取全部配置
     * @return Map
     */
    public static Map<String, String> getPropertiesMap() {
        return propertiesMap;
    }

    /**
     * 获取属性
     * @param key 属性键
     * @return String
     */
    public static String getStringValue(String key){
        return propertiesMap.get(key);
    }

    /**
     * 获取属性字符串值
     * @param key 属性键
     * @param defaultValue 默认值
     * @return String
     */
    public static String getStringv(String key, String defaultValue){
        if (!propertiesMap.containsKey(key)){
            return defaultValue;
        }
        return propertiesMap.get(key);
    }
    /**
     * 获取属性
     * @param key 属性键
     * @return String
     */
    public static int getIntValue(String key){
        return Integer.parseInt(propertiesMap.get(key));
    }

    /**
     * 获取属性
     * @param key 属性键
     * @return String
     */
    public static int getIntValue(String key, int defaultValue){
        if (!propertiesMap.containsKey(key)){
            return defaultValue;
        }

        return Integer.parseInt(propertiesMap.get(key));
    }



    /**
     * 加载 classPath 下所有 properties 属性文件内属性
     * @return Map
     */
    private static Map<String, String> getAllProperty(){
        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        File resoucePath = new File(path);
        List<String> names = new ArrayList<>();
        if (resoucePath.isDirectory()){
            for (File file : resoucePath.listFiles()){
                if (!file.getName().toLowerCase().endsWith("properties")){
                    continue;
                }

                names.add(file.getName().replace(".properties", ""));
            }
        }

        Map<String, String> configs = new HashMap<>();
        for (String name : names){
            ResourceBundle rb = ResourceBundle.getBundle(name, Locale.getDefault());
            Enumeration<String> ernum = rb.getKeys();
            while (ernum.hasMoreElements()){
                String key = ernum.nextElement();
                configs.put(key, rb.getString(key));
            }
        }

        return configs;
    }
}
