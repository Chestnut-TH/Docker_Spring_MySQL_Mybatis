package docker_spring_mysql_mybatis.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import docker_spring_mysql_mybatis.demo.form.SearchForm;
import docker_spring_mysql_mybatis.demo.interfaces.SearchServiceImpl;

@Controller
public class SearchController {
    @Autowired
    SearchServiceImpl service;
    @GetMapping("/search")
	public String search(Model model) {
        List<SearchForm> searchResult = service.callMethod();
        System.out.println(searchResult);
        model.addAttribute("result",searchResult);            
		return "search.html";
	}
}
