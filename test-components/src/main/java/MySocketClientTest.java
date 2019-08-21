import java.io.IOException;
import java.net.UnknownHostException;

public class MySocketClientTest {

	public static void main(String[] args) {
		MySocketClient socketClient = new MySocketClient();
		
		String payload = "0017231044D4   ECO0000001ST200000010004         UNLOCK                                             CANCELLATION                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ";

		try {
			socketClient.mySocketClient("192.168.245.59", 5861, payload);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
