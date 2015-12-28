package com.squarepolka.portablephoto.persistence;

import java.util.List;
import java.util.ArrayList;
import com.squarepolka.portablephoto.entity.MediaFolder;

public class MemoryStore
{
	public static List<MediaFolder> mediaFolderQueue = new ArrayList<MediaFolder>();
	public static List<String> messages = new ArrayList<String>();
}