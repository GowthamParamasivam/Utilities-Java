package com.gowtham.javautilities;
import java.net.*;
import java.io.IOException;
import java.util.*;

 public class PortScanner{
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the IP Address:");
        String ip= input.next();
		System.out.println("Please enter the Start Port:");
        int sp= input.nextInt();
		System.out.println("Please enter the End Port:");
        int ep= input.nextInt();
        if (sp > 65535 || sp< 0 || ep > 65535 || ep< 0 ){
			return;
		}
		else if(sp>=ep){
			return;
		}
		
		List<Integer> ports = new ArrayList<>();
               for (int port = sp; port <=ep; port++) {
                 try {
                 Socket s = new Socket(ip,port);
				 System.out.println(ip+":"+port);
                 s.close();
				 ports.add(port);
             }
                 catch (IOException ex) {
             }
         }//for ends
		 System.out.println(ports);
     }
}