package com.bridgelab.VisitordesignPattern;

public interface ItemElement 
{
	public int accept(ShoppingCartVisitor visitor);
}
