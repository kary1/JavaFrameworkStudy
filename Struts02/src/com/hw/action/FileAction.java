package com.hw.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileAction extends ActionSupport {

	private static final long serialVersionUID = 8035806380552115994L;
	
	private File image;//��input�е�name����ֵ����һ�£���������ֽ�������ʱ�ļ�
	private String imageFileName;

	/**
	 * �ڷ���˴���һ�����ļ���������ʱ�ļ��е��ֽ���д�뵽���ļ���
	 * @return
	 */
	public String upload(){
		
//		HttpServletRequest request = ServletActionContext.getRequest();
		
		String savePath = ServletActionContext.getServletContext()
				.getRealPath("/images/")+imageFileName;
		
		try {
			InputStream is = new FileInputStream(image);
			OutputStream os = new FileOutputStream(savePath);
			
			byte[] isArr = new byte[1024];
			int length = 0;
			while((length=is.read(isArr))!=-1){
				os.write(isArr);
			}
			is.close();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return SUCCESS;
	}
	
	public void setImage(File image) {
		this.image = image;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
}
