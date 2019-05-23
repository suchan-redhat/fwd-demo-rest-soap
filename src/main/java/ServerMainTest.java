import javax.xml.ws.Endpoint;

import com.fwd.demo.ws.SampleSoap;

public class ServerMainTest {

	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:8088/interface", new SampleSoap());
	}

}
