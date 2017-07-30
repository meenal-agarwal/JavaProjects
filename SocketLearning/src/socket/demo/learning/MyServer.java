package socket.demo.learning;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {
		try{
		ServerSocket ss1 = new ServerSocket(4444);
		System.out.println("waiting");
		Socket s1 = ss1.accept();
		System.out.println("Connection established");
		DataInputStream din = new DataInputStream(s1.getInputStream());
		DataOutputStream dout = new DataOutputStream(s1.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = "", str2 = "";
		while(!str1.equals("stop")){
			str1=din.readUTF();
			System.out.println("Client says: "+str1);
			str2 = br.readLine();
			dout.writeUTF(str2);
			dout.flush();
		}
		din.close();
		s1.close();
		ss1.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
