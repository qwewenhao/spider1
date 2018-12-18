package wenhao;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Q333 {
	public static void main(String[] args) {
		String url="https://movie.douban.com/subject/1291546/";
		try {
			//获取网页中的内容
		 Document doc = Jsoup.connect(url).get();
//		 film a=new film();
		 //集合(多个）
		 Elements es =doc.select(".actor");
		 //一个
		//  Elements es=doc.selectFirst(".actor_pl");
		  System.out.println(es);
		}catch (IOException e) {
//			TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
