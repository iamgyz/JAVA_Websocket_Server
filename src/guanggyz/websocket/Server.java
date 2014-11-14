package guanggyz.websocket;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
public class Server extends WebSocketServer{

	public static int port = 8887;
	public Server() throws UnknownHostException {
		super(new InetSocketAddress(port));
		// TODO Auto-generated constructor stub
	}


	public void onOpen(WebSocket conn, ClientHandshake arg1) {
		// TODO Auto-generated method stub
		System.out.println("New connection from " + conn.getRemoteSocketAddress().getAddress().getHostAddress());
	}
	public void onMessage(WebSocket conn, String msg) {
		System.out.println("Message from " + conn.getRemoteSocketAddress().getAddress().getHostAddress());		
		System.out.println("Content: " + msg);
		// TODO Auto-generated method stub
		
	}
	public void onClose(WebSocket conn, int arg1, String arg2, boolean arg3) {
		// TODO Auto-generated method stub
		System.out.println("Closed connection to " + conn.getRemoteSocketAddress().getAddress().getHostAddress());
	}

	public void onError(WebSocket conn, Exception arg1) {
		// TODO Auto-generated method stub
		System.out.println("ERROR from " + conn.getRemoteSocketAddress().getAddress().getHostAddress());
	}
	
	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		Server server = new Server();
		server.start();
		System.out.println("Server start at "+server.getAddress());
	}
}
