
package jp.co.sss.mahjong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SessionController {

	@RequestMapping(path = "/doWhich", method = RequestMethod.POST)
	public String result(String which) {

		System.out.println(which);
		if (which.equals("w2")) {
			return "FirstQuestion/result";
		} else {
			return "FirstQuestion/result2";
		}
	}

}
