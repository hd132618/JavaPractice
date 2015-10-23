package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "http://tv03.search.naver.net/thm?size=152x114&quality=9&q=http://sstatic.naver.net/keypage/image/dss/146/30/33/04/146_100303304_team_image_url_1435202334744.jpg";
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/ManU.jpg")) {
				
				//파일에 write하기
				
				int result;
				
				byte[] buf = new byte[100];
				
				while((result = is.read(buf)) != -1) {
					os.write(buf, 0, result);
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("이미지 다운로드 완료!!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
