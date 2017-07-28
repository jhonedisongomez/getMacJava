package getMac;

import java.net.NetworkInterface;
import java.util.Enumeration;


public class GetMac{
	
	public static void main(String[] args) {
		try {
	    
			Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();
			while(networks.hasMoreElements()) {
				NetworkInterface network = networks.nextElement();
				byte[] mac = network.getHardwareAddress();
	      
				if(mac != null) {
					System.out.print("Current MAC address : ");

					StringBuilder sb = new StringBuilder();
					for (int i = 0; i < mac.length; i++) {
						sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
					}
					System.out.println(sb.toString());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
