package com.squarepolka.portablephoto.entity;

import java.util.List;
import java.util.ArrayList;

public class MediaFolder extends AbstractMedia
{
	public static int toBeProcessed = 0;
	public static int isBusyProcessing = 1;
	public static int isFinishedProcessing = 2;

	public String name;
	public int status;
	protected List<MediaFile> mediaFiles;
	
	public MediaFolder(String name, String path)
	{
		this.name = name;
		this.path = path;
		this.status = toBeProcessed;
		this.mediaFiles = new ArrayList<MediaFile>();
	}
	
	public void addMediaFile(MediaFile file)
	{
		if (!mediaFiles.contains(file))
		{
			mediaFiles.add(file);
		}
	}
	
	public List<MediaFile> mediaFiles()
	{
		return mediaFiles;
	}
	
}