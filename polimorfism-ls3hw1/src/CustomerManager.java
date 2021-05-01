
public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger=logger;
		System.out.println("Yapýcý blok çalýþtý.");
	}
	
	public void add() {
		System.out.println("Müþteri eklendi.");
		logger.Log("Eklendi.");
	}
}
