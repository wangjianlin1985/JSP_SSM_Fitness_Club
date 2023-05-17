// 
// 
// 

package com.stern.utils;

import javax.servlet.http.HttpServletRequest;
import java.security.MessageDigest;

public class Funcs
{
    public static String MD5(final String pwd) {
        final char[] md5String = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        try {
            final byte[] btInput = pwd.getBytes();
            final MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            final byte[] md = mdInst.digest();
            final int j = md.length;
            final char[] str = new char[j * 2];
            int k = 0;
            for (final byte byte0 : md) {
                str[k++] = md5String[byte0 >>> 4 & 0xF];
                str[k++] = md5String[byte0 & 0xF];
            }
            return new String(str);
        }
        catch (Exception e) {
            return null;
        }
    }
    
    public static boolean isAjax(final HttpServletRequest request) {
        return "XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With")) || request.getParameter("ajax") != null;
    }
}
