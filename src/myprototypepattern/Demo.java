package myprototypepattern;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
     BookShop bs = new BookShop();
     bs.setBookShopName("Novelty");
     bs.loaddata();
     
     
     BookShop bs1 = (BookShop) bs.clone();
    // bs.getList().remove(2);
     bs1.setBookShopName("A1");
    // bs1.loaddata();
     
     
     System.out.println(bs);
     
     System.out.println(bs1);
	}

}
