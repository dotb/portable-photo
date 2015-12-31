package com.squarepolka.portablephoto.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ImageService
{
	@Autowired
	protected FileService fileService;
	
	public byte[] getImage(String imagePath)
	{
		return fileService.readFile("/mnt/media/photos/" + imagePath);
	}
}