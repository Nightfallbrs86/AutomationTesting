package config;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import pages.BasePage;

public class Utils extends BasePage{
	
	public static void escapeAd() throws AWTException, InterruptedException {

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        Thread.sleep(4000);

    }
	
	    public static void keyPress(int quantidade, Robot robot) throws InterruptedException {
	        for (int i = 0; i < quantidade; i++){
	            robot.keyPress(KeyEvent.VK_TAB);
	            robot.keyRelease(KeyEvent.VK_TAB);
	            Thread.sleep(3000);
	            robot.keyPress(KeyEvent.VK_T);
	            robot.keyPress(KeyEvent.VK_E);
	            robot.keyPress(KeyEvent.VK_S);
	            robot.keyPress(KeyEvent.VK_T);
	            robot.keyPress(KeyEvent.VK_E);

	        }
	    }
	}
