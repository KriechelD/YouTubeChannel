import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class FritzBoxReconnect {
	public static void main(String[] args) {
		StringBuilder soapXML = new StringBuilder();

		soapXML.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>																						");
		soapXML.append("<s:Envelope s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\">");
		soapXML.append("	<s:Body>																													");
		soapXML.append("		<u:ForceTermination xmlns:u=\"urn:schemas-upnp-org:service:WANIPConnection:1\" />										");
		soapXML.append("	</s:Body>																													");
		soapXML.append("</s:Envelope>																													");

		try {
			InetAddress connection_adress = InetAddress.getByName("fritz.box");
			Socket socket = new Socket(connection_adress, 49000);

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
			bw.write("POST /upnp/control/WANIPConn1 HTTP/1.1");
			bw.write("Host: fritz.box:49000" + "\r\n");
			bw.write("SOAPACTION: \"urn:schemas-upnp-org:service:WANIPConnection:1#ForceTermination\"" + "\r\n");
			bw.write("Content-Type: text/xml; charset=\"utf-8\"" + "\r\n");
			bw.write("Content-Length: " + soapXML.toString().length() + "\r\n");
			bw.write("\r\n");

			bw.write(soapXML.toString());
			bw.flush();

			socket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
