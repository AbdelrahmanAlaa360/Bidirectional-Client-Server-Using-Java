//package com.company;
import java.net.*;
import java.io.*;

public class DemoServer {
    public static void main(String args[]) throws Exception {
        try{
            ServerSocket ss = new ServerSocket(1224);
            System.out.println("Server is Waiting for Client..");
            Socket sk  =ss.accept();
            System.out.println("Connection Established..");

            BufferedReader keyr = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);

            // Server is Reading Message from Client Through InputStream
            InputStreamReader isr =  new InputStreamReader(sk.getInputStream());
            BufferedReader ser_receive = new BufferedReader(isr);
            String send, receive;
            while(true){
                if((receive=ser_receive.readLine()) != null){
                    System.out.println("Client: " + receive + '\n');
                }
                send= keyr.readLine();
                pw.println(send);
                if(send.equals("bye")) {
                    System.exit(0);
                }
            }
        }
        catch (Exception e){}
    }
}
