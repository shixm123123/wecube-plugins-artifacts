package com.webank.plugins.artifacts.utils;

import org.apache.commons.codec.binary.Base64;

public class StringUtilsEx {
    public static String encodeBase64String(byte[] data){
        return Base64.encodeBase64String(data);
    }
    
    public static byte[] decodeBase64(String base64String){
        return Base64.decodeBase64(base64String);
    }

}
