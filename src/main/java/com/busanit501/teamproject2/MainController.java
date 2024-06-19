package com.busanit501.teamproject2;

import com.busanit501.teamproject2.user.UserCreateForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		return "안녕하세요 sbb에 오신것을 환영합니다.";
	}

	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}

	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
