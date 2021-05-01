
public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger=logger;
		System.out.println("Yap�c� blok �al��t�.");
	}
	
	public void add() {
		System.out.println("M��teri eklendi.");
		logger.Log("Eklendi.");
	}
}
