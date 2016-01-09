package com.squarepolka.portablephoto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;

import com.squarepolka.portablephoto.service.StatusService;
import com.squarepolka.portablephoto.service.ImageService;
import com.squarepolka.portablephoto.entity.api.StatusResponse;

@RestController
public class PhotoController
{
	@Autowired
	public StatusService statusService;
	
	@Autowired
	public ImageService imageService;
	
	@RequestMapping("/status")
	@ResponseBody
	public StatusResponse getStatus()
	{
		return statusService.getStatus();
	}
	
	//@RequestMapping(value = "/image/{path:.*}", method = RequestMethod.GET, produces = "image/jpeg")
	@RequestMapping(value = "/image/{country}/{city}/{date}/{file:.+}", method = RequestMethod.GET, produces = "image/jpeg")
	@ResponseBody
	public byte[] getImage(@PathVariable String country, @PathVariable String city, @PathVariable String date, @PathVariable String file)
	{
		return imageService.getImage(country + "/" + city + "/" + date + "/" + file, file);
	}
}
