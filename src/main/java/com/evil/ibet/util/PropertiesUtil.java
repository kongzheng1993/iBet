package com.evil.ibet.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

    static Properties properties = new Properties();

    public static String getPropertie(String key) {
        {
            try {
                properties.load(PropertiesUtil.class.getClassLoader().getResourceAsStream("config/system.properties"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println(PropertiesUtil.getPropertie("AppId"));
    }

}
