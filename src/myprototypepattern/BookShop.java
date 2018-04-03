package myprototypepattern;

import java.util.ArrayList;

public class BookShop implements Cloneable
{
	
	
	String bookShopName;
	ArrayList<Book> list = new ArrayList();
	public String getBookShopName() {
		return bookShopName;
	}
	public void setBookShopName(String bookShopName) {
		this.bookShopName = bookShopName;
	}
	
	public ArrayList<Book> getList() {
		return list;
	}
	public void setList(ArrayList<Book> list) {
		this.list = list;
	}
	
	public void loaddata()
	{
		for(int i=1; i<=10; i++)
		{
			Book b = new Book();
			b.setBid(i);
			b.setbName("Book " + i);
			getList().add(b);
		}
	}
	
	@Override
	public String toString() {
		return "BookShop [bookShopName=" + bookShopName + ", list=" + list + "]";
	}
   
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
//		@Override
//		protected BookShop clone() throws CloneNotSupportedException 
//		{ 
//			BookShop shop = new BookShop();
//			for(Book b: this.getList())
//			{
//				shop.getList().add(b);
//			}
//			return shop;
//	}

}
