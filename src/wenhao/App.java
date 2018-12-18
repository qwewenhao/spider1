package wenhao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
		//�̳߳�
		//�̶���С
		ExecutorService pool=  Executors.newFixedThreadPool(1);
		//���޻���
//		pool = Executors.newCachedThreadPool();
//		//һ���߳�
//		pool=Executors.newSingleThreadExecutor();
		
		ArrayList<Film> list=new ArrayList();
		String url="https://movie.douban.com/top250?start=";
		for(int i=0;i<10;i++) {
			String path=String.format("%s%d",url, i*25);
			pool.submit(new Spider(url+(25*i),list));
		}
			
		/*
		
		
//		Ŀ��URL
	String url="https://movie.douban.com/top250";
//		ʹ��Jsoup�ĵ�
		
   try{
	   Document doc = Jsoup.connect(url).get();
	   Elements es = doc.select(".grid_view .item");
	   System.out.println(es.size());
	   
	   //����һ��ӰƬ���б�
	   ArrayList<Film> list = new ArrayList<>();
	   
	   
	   for(Element e:es) {
		   Film f = new Film();
		   //ÿһ��ӰƬ
		  f.id =Integer.parseInt(e.select(".pic em").first().text());
		  f.poster=e.select("img").first().attr("src");
		  f.info =e.select(".bd p").first().text();
		  f.title=e.select(".title").first().text();
		  f.rating=Double.parseDouble(e.select(".star .rating_num").first().text());
		  String num =e.select(".star span").last().text();
		  f.num = Integer.parseInt(num.substring(0,num.length()-3));
		  f.rating=Double.parseDouble(e.select(".star .rating_num").first().text());
		  f.quote=e.select("quote span").text();
		
		  Element t = e.select(".title").first();
		  String num = e.select(".star span").last().text();
		   System.out.println(t.text() +","+num);
		   
		  System.out.println(f);
		   list.add(f);
	   }
	   }catch (IOException e) {
//		TODO
		e.printStackTrace();
	}*/
	}
   
	}
	
