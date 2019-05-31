package com.inspire4u;
public class MyMain {

	public static void main(String[] args) {
		System.out.println("Hello World");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chrome/chromedriver.exe");
		WebDriver driver;
		
		Proxy proxy = new Proxy(); 
		proxy.setHttpProxy("kdc-proxy.wipro.com:8080"); 
		proxy.setSslProxy("kdc-proxy.wipro.com:8080"); 

		DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
		capabilities.setCapability("proxy", proxy);

		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("start-maximized"); 

		capabilities.setCapability(ChromeOptions.CAPABILITY, options); 

		driver = new ChromeDriver(capabilities);
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Geeta Press Shri Ramcharitmanas with Book Stand");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}
	

	}

}
