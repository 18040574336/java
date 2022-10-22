package com.lp.springxml.application.controller;

import com.lp.springxml.model.Data;
import com.lp.springxml.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public Object hello(){
		Person p = new Person(null ,12);
		return  p;
	}

	@RequestMapping("/valid")
	public String valid(@RequestBody  @Valid  @Validated(Person.class) List<Person> personList, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			for (FieldError fieldError : bindingResult.getFieldErrors()) {
				System.out.println(fieldError);
			}
			return "fail";
		}
		return "success";
	}
}
