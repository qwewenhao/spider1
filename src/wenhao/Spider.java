package wenhao;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * ��ȡҳ����ӰƬ��ϵ������
 */
public class Spider implements Runnable{
	/*
	 * ҳ���·��(url)
	 */
	String url;
	/*
	 * �洢ץȡ������
	 */
	ArrayList<Film> list;
	/*
	 * ��������
	 * ҳ���·��
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
		System.out.println(name + "�̣߳�����"+url);
		//jsoup
		
		
		 try{
			   Document doc = Jsoup.connect(url).get();
			   Elements es = doc.select(".grid_view .item");
			   
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
			
				  System.out.println(name +":"+ f);
				   list.add(f);
			   }
	}catch (IOException e) {
//		TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
