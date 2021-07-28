//package com.company;
import java.net.*;
import java.io.*;

public class DemoClient {
    public static void main(String args[]) throws Exception {
        try{
            Socket sk = new Socket("localhost", 1224);
            System.out.println("*********Chat Started*********");
            // To Read From Keyboard
            BufferedReader keyr = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);

            // Client is Reading Message from Server Through InputStream
            InputStreamReader isr =  new InputStreamReader(sk.getInputStream());
            BufferedReader ser_receive = new BufferedReader(isr);
            String send, receive;
            while (true){
                send = keyr.readLine();
                pw.println(send);
                if((receive = ser_receive.readLine()) != null){
                    System.out.println("Server: " + receive + '\n');
                }
                if(send.equals("bye")) {
                    System.exit(0);
                }
            }
        }
        catch (Exception e){}
    }
}
