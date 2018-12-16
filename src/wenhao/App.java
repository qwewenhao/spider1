package wenhao;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class App {
	
/*
 * ��������
 */
	
	public static void main(String[] args) {
//		Ŀ��URL
		String url="https://movie.douban.com/top250";
//		ʹ��Jsoup�ĵ�
		
   try{
	   Document doc = Jsoup.connect(url).get();
	   Elements es = doc.select(".grid_view .item");
	   System.out.println(es.size());
	   
	   for(Element e:es) {
		   //ÿһ��ӰƬ
		  Element t = e.select(".title").first();
		  String num = e.select(".star span").last().text();
		   System.out.println(t.text() +","+num);
	   }
//.title .����class	      
	/*   String title = doc.title();
	   String html=doc.html();
	   String data = doc.data();
	
       System.out.println(title);
	   System.out.println(data);*/
	   }catch (IOException e) {
//		TODO
		e.printStackTrace();
	}
	}
   
	

private static void select(String string) {
	// TODO Auto-generated method stub
	System.out.println();
}
}
	
