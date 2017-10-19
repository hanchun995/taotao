package com.taotao.controller;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class FTPTest {
	
	@Test
	public void testFtpClient() throws Exception{
		
		FTPClient ftpClient = new FTPClient();
		ftpClient.connect("192.168.245.129",21);
		ftpClient.login("ftpuser", "123456");
		FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\paperpass\\Desktop\\360截图17571127725087.png"));
		ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		ftpClient.storeFile("123.jpg", inputStream);
		inputStream.close();
		
		ftpClient.logout();
		
	}
	

}
