package korea.com.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping("/insert.do")
	private String insert() {
		// TODO Auto-generated method stub
		return HomeController.VIEW_PATH + "insert.jsp";
	}
	@RequestMapping("/view.do")
	private String view() {
		// TODO Auto-generated method stub
		return HomeController.VIEW_PATH + "view.jsp";
	}

}
