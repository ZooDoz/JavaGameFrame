package com.example.gameframe.ser;

import com.example.gameframe.net.wshandler.WsHandlerAdapterHandler;
import com.example.gameframe.ser.netty.websocket.WebsocketServer;

public class SerDemo 
{

    
    public static void main(String[] args) throws Exception {
        int port;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        } else {
            port = 8181;
        }
        System.out.println("start");
        WsHandlerAdapterHandler wsh = new WsHandlerAdapterHandler();
        new WebsocketServer(port , wsh).run();
    }
}
