package com.wikipedia.cmptest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class RuntimeSettings {
    public static String getRootUrl() throws Exception {
        File temp = new File("target/classes", "test.properties");
        InputStream is = new FileInputStream(temp);
        java.util.Properties p = new java.util.Properties();
        
        p.load(is);
        
        String rootUrl = p.getProperty("rootUrl");

        return rootUrl;
    }
}