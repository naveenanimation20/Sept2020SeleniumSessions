package SeleniumSessions;

public class LoginPage {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		br.init_driver("chrome");

		br.launchUrl("http://www.google.com");
		String title = br.getPageTitle();
		System.out.println("page title is: " + title);

		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("in-correct title");
		}

		br.closeBrowser();

	}

}
