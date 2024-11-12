package Main;

public class SumaYRestaHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddThread h1 = new AddThread();
		SubThread h2 = new SubThread();
		
		h1.start();
		h2.start();
	}

}
