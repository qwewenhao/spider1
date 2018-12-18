package wenhao;

public class Film {
    /*影片名称*/
	String title;
    /*相关信息*/
	String info;
       /* 评分*/
	double  rating;
    /* 评分人数*/
	int num;
	
	/*
               * 排名
	 */
	int id;
	
	/*
	 * 海报
	 */
	String poster;
	
	/*
	 * 短评
	 */
	String quote;

	@Override
	public String toString() {
		return "Film [title=" + title + ", info=" + info + ", rating=" + rating + ", num=" + num + ", id=" + id
				+ ", poster=" + poster + ", quote=" + quote + "]";
	}
	

}
