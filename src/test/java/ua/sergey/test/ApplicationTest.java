package ua.sergey.test;

import org.junit.Test;

import java.util.Base64;

import static org.junit.Assert.*;


public class ApplicationTest {
    @Test
    public void testconfigureGlobal() throws Exception {
        String auth = "dXNlcjp1c2Vy";
        System.out.print(new String(Base64.getDecoder().decode(auth)));

    }

}