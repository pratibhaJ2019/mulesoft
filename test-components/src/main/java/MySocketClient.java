import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
//import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

import com.google.common.io.CharStreams;

public class MySocketClient {

	public void mySocketClient(String host, int port, String payload)
			throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {
		/*
		 * get the localhost IP address, if server is running on some other IP, you need
		 * to use that InetAddress host = InetAddress.getLocalHost();
		 */
		Socket socket = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		MySocketClient mySocketClient = new MySocketClient();

		// establish socket connection to server
		socket = new Socket(host, port);
		// write to socket using ObjectOutputStream
		oos = new ObjectOutputStream(socket.getOutputStream());
		System.out.println("Sending request to Socket Server");

		oos.writeObject(payload);
		// read the server response message
		//InputStream inputStream = socket.getInputStream();


		ois = new ObjectInputStream(socket.getInputStream());
		String message = (String) ois.readObject();

		System.out.println("Message: " + message);
		// close resources
		ois.close();
		oos.close();
		socket.close();
		Thread.sleep(100);
	}

	public String convert(InputStream inputStream) throws IOException {

		StringWriter writer = new StringWriter();
		IOUtils.copy(inputStream, writer, StandardCharsets.UTF_8);
		return writer.toString();
	}

	public String convert2(InputStream inputStream) throws IOException {
		String text = null;

		try (final Reader reader = new InputStreamReader(inputStream)) {
			text = CharStreams.toString(reader);
		}
		return text;
	}
}
