package com.squarepolka.portablephoto.service;

import java.util.Calendar;
import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.squarepolka.portablephoto.entity.MediaFile;
import com.squarepolka.portablephoto.entity.MediaFolder;
import com.squarepolka.portablephoto.integration.MediaInterface;

@Service
public class ContextService
{
	@Autowired
	public MediaInterface mediaInterface;
	
	//public DateFormatter dateFormatter;
	
	public ContextService()
	{
		//this.dateFormatter = new DateFormatter(new SimpleDateFormat("yyyy-MMMM"));
	}
	
	/*
		Creates a folder in the format:
		/mnt/media/<media type>/<country>/<city>/<date>

		For example:
		/mnt/media/photos/Australia/Melbourne/2015-December
	*/
	public MediaFolder dstFolderForFile(MediaFile file)
	{
		String dstRoot = "/mnt/media/unknown/";
		
		if (MediaFile.TypePhoto == file.type())
		{
			dstRoot = "/mnt/media/photos/";
		}
		else if (MediaFile.TypeVideo == file.type())
		{
			dstRoot = "/mnt/media/videos/";
		}
		else // Unknown file type.
		{
			System.out.println("Tried to process an unknown file type: " + file.name);
		}
		
		/*Calendar capturedDate = mediaInterface.captureDateForMediaFile(file);
		String locationStr = locationStringForDate(captureDate);
		String formattedDate = dateFormatter.format(capturedDate);
		String folderPath = dstRoot + locationStr + formattedDate;
		
		MediaFolder dstFolder = new MediaFolder(formattedDate, folderPath);
		return dstFolder;
		*/
		return new MediaFolder("", "");
	}
	
	public String locationStringForDate(Calendar date)
	{
		return "Thailand/Puket/";
	}
}