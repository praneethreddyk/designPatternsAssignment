import java.io.IOException;


public class Trading{
	
	
	public Trading() throws IOException{
		boolean loginStatus;
		Facade facade = new Facade();
		loginStatus = facade.login();
		if (loginStatus) {
			facade.productOperation();
		}
	}
	

	public static void main(String[] args) throws IOException{
		System.out.println("Hello have a good time in trading");
		new Trading();
	}

}
