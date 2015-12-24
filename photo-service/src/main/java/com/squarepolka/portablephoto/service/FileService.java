package com.squarepolka.portablephoto.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Service
public class FileService
{

	public String readJson (String filename)
	{
		ApplicationContext appContext =
				new ClassPathXmlApplicationContext(new String[] {});

		Resource resource = appContext.getResource("classpath:json/"+filename);

		String jsonString = "";

		try{
			InputStream is;
			is = resource.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			String line;
			while ((line = br.readLine()) != null) {
				jsonString += line;
			}
			br.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}

		return jsonString;
	}
}
