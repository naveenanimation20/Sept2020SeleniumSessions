package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreTable {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/8048/scorecard/1216495/sunrisers-hyderabad-vs-mumbai-indians-56th-match-indian-premier-league-2020-21");

		System.out.println(getWicketTakerName("SA Yadav"));
		System.out.println(getWicketTakerName("Ishan Kishan"));

		System.out.println(getScoreCardList("Ishan Kishan"));
		System.out.println(getScoreCardList("SA Yadav"));

	}

	public static String getWicketTakerName(String playerName) {
		String wicketTakerName = driver
				.findElement(
						By.xpath("//a[text()='" + playerName + "']//parent::td//following-sibling::td//span//span"))
				.getText();
		return wicketTakerName;

	}

	public static List<String> getScoreCardList(String playerName) {

		System.out.println("score card for : " + playerName);
		List<String> scoreCardList = new ArrayList<String>();

		List<WebElement> scoreList = driver
				.findElements(By.xpath("//a[text()='" + playerName + "']//parent::td//following-sibling::td"));

		for (int i = 1; i < scoreList.size(); i++) {
			String scoreText = scoreList.get(i).getText();
			if (!scoreText.isEmpty()) {
				scoreCardList.add(scoreText);
			}

		}

		return scoreCardList;

	}

}
