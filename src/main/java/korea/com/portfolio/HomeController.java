package korea.com.portfolio;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	static final String VIEW_PATH = "/WEB-INF/views/";
	
	@RequestMapping(value = {"/", "/home.do"})
	public String home() {
		
		return VIEW_PATH + "home.jsp";
	}
	
}
