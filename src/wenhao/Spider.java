package wenhao;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * 获取页面中影片星系的爬虫
 */
public class Spider implements Runnable{
	/*
	 * 页面的路径(url)
	 */
	String url;
	/*
	 * 存储抓取的数据
	 */
	ArrayList<Film> list;
	/*
	 * 创建爬虫
	 * 页面的路径
	 */

	public Spider(String url, ArrayList<Film> list) {
		super();
		this.url = url;
		this.list = list;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name =Thread.currentThread().getName();
		System.out.println(name + "线程，处理："+url);
		//jsoup
		
		
		 try{
			   Document doc = Jsoup.connect(url).get();
			   Elements es = doc.select(".grid_view .item");
			   
			   //创建一个影片的列表
			   ArrayList<Film> list = new ArrayList<>();
			   
			   
			   for(Element e:es) {
				   Film f = new Film();
				   //每一部影片
				  f.id =Integer.parseInt(e.select(".pic em").first().text());
				  f.poster=e.select("img").first().attr("src");
				  f.info =e.select(".bd p").first().text();
				  f.title=e.select(".title").first().text();
				  f.rating=Double.parseDouble(e.select(".star .rating_num").first().text());
				  String num =e.select(".star span").last().text();
				  f.num = Integer.parseInt(num.substring(0,num.length()-3));
				  f.rating=Double.parseDouble(e.select(".star .rating_num").first().text());
				  f.quote=e.select("quote span").text();
			
				  System.out.println(name +":"+ f);
				   list.add(f);
			   }
	}catch (IOException e) {
//		TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
