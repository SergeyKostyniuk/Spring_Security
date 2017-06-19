package ua.sergey.test;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Base64;

import static org.junit.Assert.*;


public class ApplicationTest {
    @Test
    public void testconfigureGlobal() throws Exception {
        String auth = "dXNlcjp1c2Vy";
        System.out.println(new String(Base64.getDecoder().decode(auth)));

        System.out.println(new BCryptPasswordEncoder().encode("user"));



    }

}