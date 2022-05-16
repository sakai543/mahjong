/*
 * package jp.co.sss.mahjong.controller;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.ui.ModelMap; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod;
 * 
 * import jp.co.sss.mahjong.form.pinhuForm;
 * 
 * @Controller public class SessionController {
 * 
 * @RequestMapping(path = "/mahjong/doWhich", method = RequestMethod.POST)
 * public String result(boolean which1, boolean which2, boolean which3) {
 * 
 * System.out.println(which1); System.out.println(which2);
 * System.out.println(which3); return "FirstQuestion/result"; }
 * 
 * 
 * @RequestMapping(path = "/doWhich", method = RequestMethod.POST) public String
 * result(String m1, String m3) { return "FirstQuestion/result2"; }
 * 
 * 
 * 
 * @RequestMapping(path = "/doWhich2", method = RequestMethod.POST) public
 * String result2(String p1) { return "FirstQuestion/result"; }
 * 
 * 
 * 
 * @RequestMapping(path = "/pinhu", method = RequestMethod.POST) public String
 * pinhu(pinhuForm form) { System.out.println("riyu1:" + form.getRiyu1());
 * System.out.println("riyu1:" + form.getRiyu2()); System.out.println("riyu1:" +
 * form.getRiyu3()); return "result3"; }
 * 
 * 
 * @RequestMapping(path = "/pinhu", method = RequestMethod.POST)
 * 
 * public String pinhu(pinhuForm p, ModelMap model) {
 * 
 * System.out.println(p.isRiyu1()); System.out.println(p.isRiyu2());
 * System.out.println(p.isRiyu3());
 * 
 * if (p.isRiyu1() == true) { model.addAttribute("message1", "面子がすべて順子ではない"); }
 * else if (p.isRiyu2() == true) { model.addAttribute("message2",
 * "雀頭が役牌以外ではない"); } else if (p.isRiyu3() == true) {
 * model.addAttribute("message3", "待ちがリャンメンではない"); }
 * 
 * return "result3"; }
 * 
 * 
 * public String pinhu(ModelMap model) {
 * 
 * System.out.println(pinhuForm.isRiyu1());
 * System.out.println(pinhuForm.isRiyu2());
 * System.out.println(pinhuForm.isRiyu3()); if (pinhuForm.isRiyu1() == null) {
 * model.addAttribute("message1", "面子がすべて順子ではない"); } if (pinhuForm.isRiyu2() ==
 * null) { model.addAttribute("message2", "雀頭が役牌以外ではない"); } if
 * (pinhuForm.isRiyu3() == null) { model.addAttribute("message3",
 * "待ちがリャンメンではない"); } return "result3"; }
 * 
 * 
 * }
 */