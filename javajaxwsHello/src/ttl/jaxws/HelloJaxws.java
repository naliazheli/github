package ttl.jaxws;

/** 
 * 提供 WebService 服务的测试类<br> 
 * <b>注意：</b>该类必须有一个无参构造方法，否则无法使用 MyEclipse 的向导为此类创建 jax-ws 的 webService 服务端类<br> 
 * <b>创建日期</b>：2011-1-17 
 * @author <a href="mailto:hemingwang0902@126.com" mce_href="mailto:hemingwang0902@126.com">何明旺</a> 
 */  
public class HelloJaxws {  
    public String sayHello(String userName) {  
        return userName + "，您好，这是我的第一个 jax-ws 程序。";  
    }  
    public int add(int i, int j) {  
        return i + j;  
    }  
}  