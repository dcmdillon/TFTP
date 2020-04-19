package edu.dmas.tftp;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client {
	
	
	
	
	
	public Client() {
		//initializer
	}
	
	public void requestFile(String add, String rType, String Mode,String fileName) {
		//this will be called from TFTP.java as the 'run' method
		//setup options and special varibles beforehand, then call this method
		try {
			DatagramSocket socket = new DatagramSocket();
			
			
			byte[] buf;
			
			if(rType.equalsIgnoreCase("Get")) {
				buf = new byte[]{};
			}
			else {
				
			}
			
			
			
			InetAddress address = InetAddress.getByName(add);
			
			
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
