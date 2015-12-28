package com.squarepolka.portablephoto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import com.squarepolka.portablephoto.service.StatusService;
import com.squarepolka.portablephoto.entity.api.StatusResponse;

@RestController
public class PhotoController
{
	@Autowired
	public StatusService statusService;
	
	@RequestMapping("/status")
	@ResponseBody
	public StatusResponse getStatus()
	{
		return statusService.getStatus();
	}
}
