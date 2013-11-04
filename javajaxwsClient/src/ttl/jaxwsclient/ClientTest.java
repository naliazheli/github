package ttl.jaxwsclient;
 
public class ClientTest {  
    public static void main(String[] args) {  
        HelloJaxwsDelegate service = new HelloJaxwsService().getHelloJaxwsPort();  
            System.out.println(service.sayHello("ttl"));  
            System.out.println("result is: " + service.add(1, 2));  
        }  
    }  