import org.testng.annotations.Test;

public class NewTest {

	@Test(priority=1)
	public void runCreateLead() {
		System.out.println("Create Lead");
	}
	
	@Test(priority=0,invocationCount=6,threadPoolSize=3)
	public void editLead() {
		System.out.println("Edit Lead");
	}
	
	@Test(enabled=false)
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
}
