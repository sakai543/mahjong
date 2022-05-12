package jp.co.sss.mahjong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SessionController {

	@RequestMapping(path = "/doWhich", method = RequestMethod.GET)
	public String result(String win, String lose) {
		System.out.println(win);
		return "result";
	}
}
