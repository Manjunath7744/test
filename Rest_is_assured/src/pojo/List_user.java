package pojo;

import java.util.List;

public class List_user 
{
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	public int getPage() {
		return page;
	}
	public int getPer_page() {
		return per_page;
	}
	public int getTotal() {
		return total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	private Support support;
	private List<Data> data;
	public Support getSupport() {
		return support;
	}
	public List<Data> getData() {
		return data;
	}
	

}
