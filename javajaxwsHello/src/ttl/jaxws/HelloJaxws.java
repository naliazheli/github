package ttl.jaxws;

/** 
 * �ṩ WebService ����Ĳ�����<br> 
 * <b>ע�⣺</b>���������һ���޲ι��췽���������޷�ʹ�� MyEclipse ����Ϊ���ഴ�� jax-ws �� webService �������<br> 
 * <b>��������</b>��2011-1-17 
 * @author <a href="mailto:hemingwang0902@126.com" mce_href="mailto:hemingwang0902@126.com">������</a> 
 */  
public class HelloJaxws {  
    public String sayHello(String userName) {  
        return userName + "�����ã������ҵĵ�һ�� jax-ws ����";  
    }  
    public int add(int i, int j) {  
        return i + j;  
    }  
}  