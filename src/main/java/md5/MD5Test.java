package md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * /**
 * Alipay.com Inc
 * Copyright (c) 2004-2017 All Rights Reserved.
 *
 * @author dz on 2018/9/2.
 */

public class MD5Test {

    public static void main(String[] args) {
        MessageDigest md5Digest = null ;
        try {
            md5Digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


        System.out.println(md5Digest.digest("122".getBytes()).toString());
    }
}
