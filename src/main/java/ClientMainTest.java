
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.fwd.demo.beans.InternalRequest;
import com.fwd.demo.beans.InternalResponse;
import com.fwd.demo.ws.SampleSoapInterface;

public class ClientMainTest {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://127.0.0.1:8088/soapToRest?wsdl");
			QName qname = new QName("http://ws.demo.fwd.com/", "SampleSoapService");
			Service service = Service.create(url, qname);
			SampleSoapInterface ss = service.getPort(SampleSoapInterface.class);
			
			InternalRequest my = new InternalRequest();
			my.setAppFrom("haha2");
			InternalResponse ret = ss.wsdlcall(my);
			System.out.println("return: "+ret.getResult());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}