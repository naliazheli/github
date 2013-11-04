package ttl.jaxws;

@javax.jws.WebService(targetNamespace = "http://jaxws.ttl/", serviceName = "HelloJaxwsService", portName = "HelloJaxwsPort", wsdlLocation = "WEB-INF/wsdl/HelloJaxwsService.wsdl")
public class HelloJaxwsDelegate {

	ttl.jaxws.HelloJaxws helloJaxws = new ttl.jaxws.HelloJaxws();

	public String sayHello(String userName) {
		return helloJaxws.sayHello(userName);
	}

	public int add(int i, int j) {
		return helloJaxws.add(i, j);
	}

}