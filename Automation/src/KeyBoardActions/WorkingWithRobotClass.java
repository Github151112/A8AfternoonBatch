package KeyBoardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

public class WorkingWithRobotClass extends BaseClass {

	public static void main(String[] args) throws AWTException, InterruptedException {

		setUp("chrome", 20, "https://www.myntra.com");

		// Press Ctrl+Shift+I
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_I);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_I);

		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(2000);
		}

	}

}
