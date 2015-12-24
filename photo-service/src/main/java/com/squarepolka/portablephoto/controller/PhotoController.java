package com.squarepolka.portablephoto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class PhotoController
{
	@RequestMapping("/status")
	@ResponseBody
	public String auth()
	{
		return "Hello";	
	}
}
