package swaglab;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends Parameters {

	@BeforeMethod
	public void mySetup() {
		driver.get(Url);

	}

	@Test()

	public void LoginWithStandardUSer() throws InterruptedException {
		loginFunction(StandardUserName, passWord);
		Thread.sleep(3000);

	}

	@Test()
	public void LoginWithProblemUser() throws InterruptedException {
		loginFunction(ProblemUserName, passWord);
		Thread.sleep(3000);
	}

	@Test()
	public void LoginWithPerformanceUser() throws InterruptedException {
		loginFunction(PerformanceUserName, passWord);
		Thread.sleep(3000);

	}

	@AfterTest
	public void myPostTesting() {
	}
}
