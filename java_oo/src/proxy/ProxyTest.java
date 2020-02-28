package proxy;
//代理模式 
//被代理类不直接调用方法，而是通过代理类来调用，代理类和被代理类实现同一套接口
//对外不暴露被代理类，只暴露代理类

public class ProxyTest {
	public static void main(String[] args) {
		Server server = new Server();
		ProxyServer ps = new ProxyServer(server);
		ps.browse();
	}
	
}

//代理类和被代理类实现统一套接口
interface NetWork{
	void browse();
}

//被代理类
class Server implements NetWork{

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("真实服务器访问");
	}
	
}

//代理类
class ProxyServer implements NetWork{

	private NetWork work;
	
	//NetWork多态，实现NetWork接口 
	public ProxyServer(NetWork work) {
		this.work = work;
	}
	
	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("代理服务器访问");
		work.browse();
	}
	
}