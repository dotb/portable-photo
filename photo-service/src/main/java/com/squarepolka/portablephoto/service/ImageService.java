package com.squarepolka.portablephoto.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import magick.ImageInfo;
import magick.MagickImage;
import magick.MagickException;

@Service
public class ImageService
{
	@Autowired
	protected FileService fileService;
	
	public byte[] getImage(String imagePath, String imageName)
	{
		String cachedImagePath = "/tmp/" + imageName;
		try 
		{
			ImageInfo imageInfo = new ImageInfo(imagePath);
			MagickImage image = new MagickImage(imageInfo);
			image.scaleImage(1000, 1000);
			image.setFileName(cachedImagePath);
			image.writeImage(imageInfo);
		}
		catch (MagickException e)
		{
			e.printStackTrace();
		}
		
		return fileService.readFile(cachedImagePath);
	}
}