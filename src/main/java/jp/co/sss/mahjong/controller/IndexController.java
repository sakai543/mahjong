package jp.co.sss.mahjong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(path = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(path = "FirstQuestion/firstQuestion")
	public String firstQuestion() {
		return "FirstQuestion/firstQuestion";
	}

	@RequestMapping(path = "FirstQuestion/firstAnswer")
	public String firstAnswer() {
		return "FirstQuestion/firstAnswer";
	}

	@RequestMapping(path = "FirstQuestion/result")
	public String result() {
		return "FirstQuestion/result";
	}

	@RequestMapping(path = "FirstQuestion/result2")
	public String result2() {
		return "FirstQuestion/result2";
	}

	@RequestMapping(path = "Pinhu/secondQuestion")
	public String secondQuestion() {
		return "Pinhu/secondQuestion";
	}

	@RequestMapping(path = "Pinhu/secondAnswer")
	public String secondAnswer() {
		return "Pinhu/secondQuestion";
	}

	@RequestMapping(path = "SecondQuestion/secondRule")
	public String secondRule() {
		return "SecondQuestion/secondRule";
	}

	@RequestMapping(path = "SecondQuestion/secondQuestion")
	public String secondQuestion2() {
		return "SecondQuestion/secondQuestion";
	}

	@RequestMapping(path = "SecondQuestion/secondAnswer")
	public String secondAnswer2() {
		return "SecondQuestion/secondAnswer";
	}

	@RequestMapping(path = "ThirdQuestion/thirdRule")
	public String thirdRule() {
		return "ThirdQuestion/thirdRule";
	}

	@RequestMapping(path = "ThirdQuestion/thirdQuestion")
	public String thirdQuestion() {
		return "ThirdQuestion/thirdQuestion";
	}

	@RequestMapping(path = "ThirdQuestion/thirdAnswer")
	public String thirdAnswer() {
		return "ThirdQuestion/thirdAnswer";
	}

	@RequestMapping(path = "Last/last")
	public String last() {
		return "Last/last";
	}

}
