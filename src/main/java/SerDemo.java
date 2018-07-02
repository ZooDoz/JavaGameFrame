import net.wshandler.WsNetHandler;
import ser.netty.websocket.WebsocketServer;

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
