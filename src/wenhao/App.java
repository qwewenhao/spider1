package wenhao;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class App {
	
/*
 * 程序的入口
 */
	
	public static void main(String[] args) {
//		目标URL
		String url="https://movie.douban.com/top250";
//		使用Jsoup文档
		
   try{
	   Document doc = Jsoup.connect(url).get();
	   Elements es = doc.select(".grid_view .item");
	   System.out.println(es.size());
	   
	   for(Element e:es) {
		   //每一步影片
		  Element t = e.select(".title").first();
		  String num = e.select(".star span").last().text();
		   System.out.println(t.text() +","+num);
	   }
//.title .代表class	      
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
	
