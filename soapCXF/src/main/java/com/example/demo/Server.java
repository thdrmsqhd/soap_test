package com.example.demo;

import javax.xml.ws.Endpoint;
import com.tutorialspoint.helloworld.HelloWorldPortType;

public class Server {
   public static void main(String[] args) throws Exception {
      HelloWorldPortType implementor = new HelloWorldImpl();
      Endpoint.publish("http://localhost:9090/HelloServerPort", implementor);
      System.out.println("Server ready...");
      Thread.sleep(5 * 60 * 1000);
      System.out.println("Server exiting");
      System.exit(0);
   }
}