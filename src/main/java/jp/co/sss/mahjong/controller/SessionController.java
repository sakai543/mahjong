
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

	@RequestMapping(path = "/doWhich2", method = RequestMethod.POST)
	public String result2(String which) {

		System.out.println(which);
		if (which.equals("p1")) {
			return "SecondQuestion/secondAnswer";
		} else {
			return "SecondQuestion/secondAnswer2";
		}
	}

	@RequestMapping(path = "/doWhich3", method = RequestMethod.POST)
	public String result3(String which) {

		System.out.println(which);
		if (which.equals("q1")) {
			return "SecondQuestion/secondAnswer";
		} else {
			return "SecondQuestion/secondAnswer2";
		}
	}

	@RequestMapping(path = "/doWhich4", method = RequestMethod.POST)
	public String result4(String which) {

		System.out.println(which);
		if (which.equals("r2")) {
			return "SecondQuestion/secondAnswer";
		} else {
			return "SecondQuestion/secondAnswer2";
		}
	}

}
