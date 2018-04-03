package com.bridgelab.VisitordesignPattern;

public interface ShoppingCartVisitor {
	int visit(Book book);
    int visit(Fruit fruit);

}
