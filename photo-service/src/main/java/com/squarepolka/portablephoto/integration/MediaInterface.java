package com.squarepolka.portablephoto.integration;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import org.springframework.stereotype.Component;
import com.squarepolka.portablephoto.entity.MediaFolder;
import com.squarepolka.portablephoto.entity.MediaFile;

@Component
public class MediaInterface
{
	public List<MediaFolder> findRemovableMedia()
	{
		List<MediaFolder> folderList = new ArrayList<MediaFolder>();
		return folderList;
	}
	
	public Calendar captureDateForMediaFile(MediaFile mediaFile)
	{
		return Calendar.getInstance();
	}
	
	public void copyFileToFolder(MediaFile file, MediaFolder folder)
	{
		
	}
	
	public void moveFileToFolder(MediaFile file, MediaFolder folder)
	{
	
	}
}