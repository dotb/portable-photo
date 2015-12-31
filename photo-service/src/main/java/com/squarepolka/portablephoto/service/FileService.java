package com.squarepolka.portablephoto.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;

@Service
public class FileService
{

	public byte[] readFile (String filePath)
	{
		ByteArrayOutputStream byteArray = new ByteArrayOutputStream();

		try
		{
			BufferedReader br = new BufferedReader(new FileReader(filePath));

			int readByte;
			while ((readByte = br.read()) != -1)
			{
				byteArray.write(readByte);
			}

			br.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		return byteArray.toByteArray();
	}
}
