package jp.co.sss.mahjong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(path = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(path = "/firstQuestion")
	public String firstQuestion() {
		return "firstQuestion";
	}

	@RequestMapping(path = "/firstAnswer")
	public String firstAnswer() {
		return "firstAnswer";
	}

}
