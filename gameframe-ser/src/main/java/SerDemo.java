import main.java.com.example.gameframe.net.wshandler.WsNetHandler;
import com.example.gameframe.ser.netty.websocket.WebsocketServer;
import com.example.gameframe.ser.netty.websocket.WsHandler;

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
        WsNetHandler wsh = new WsNetHandler();
        new WebsocketServer(port , wsh).run();
    }
}
