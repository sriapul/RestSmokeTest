package com;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertTrue;

/**
 * Created by Ranjani on 1/9/2016.
 */
public class SmokeTest {



    @Test
    public void checkHomePage() throws IOException {

        URL obj = new URL("http://sirva.com/en-us/");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        assertTrue( con.getResponseCode()== 200);

    }
    @Test
    public void checkClientServicePage() throws IOException {

        URL obj = new URL("http://sirva.com/en-us/Corporate-Relocation-Services/Client-Services");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        assertTrue( con.getResponseCode()== 200);


    }
    @Test
    public void checkusMovingPage() throws IOException {

        URL obj = new URL("http://sirva.com/en-us/consumer-relocation-services/us-moving");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        assertTrue( con.getResponseCode()== 200);


    }
    @Test
    public void checkGlobalMovingPage() throws IOException {

        URL obj = new URL("http://sirva.com/en-us/consumer-relocation-services/global-moving");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        assertTrue( con.getResponseCode()== 200);


    }



}
