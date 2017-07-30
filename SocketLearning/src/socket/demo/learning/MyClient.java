package socket.demo.learning;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClient {

	public static void main(String[] args) {
		try{
		Socket s = new Socket("localhost",4444);
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1="", str2="";
		while(!str1.equals("stop")){
			str1 = br.readLine();
			dout.writeUTF(str1);
			dout.flush();
			str2= din.readUTF();
			System.out.println("Server sent a msg: "+str2);
		}
		
		din.close();
		s.close();
		
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
