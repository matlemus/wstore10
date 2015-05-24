package com.packt.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
		public String welcome(Model model) {
			model.addAttribute("greeting", "Bienvenido al Web Store Nanotech!");
			model.addAttribute("tagline", "El �nico y asombroso webstore de nanotecnolog�a");
			return "welcome";
	}
}