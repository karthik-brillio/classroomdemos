package com.brillio.training.entity;

public class Television extends Product {
	private int size; // in inches
	private String screenType; // TFT, LCD, LED, CRT, PLASMA, PROJECTION

	public Television() {
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public Television(int productId, String productName, double unitPrice, int size, String screenType) {

		super(productId, productName, unitPrice);
		this.size = size;
		this.screenType = screenType;
	}

	@Override
	public String toString() {
		return super.toString() + "Television [size=" + size + ", screenType=" + screenType + "]";
	}

	// this method overrides the inherited print() method
	// from the product class. we use an annotation @override
	// to inform the compiler to check if it is really overriding

	@Override
	public void print() {
		super.print();
		System.out.println("size                 " + size);
		System.out.println("screen type          " + screenType);
	}

}
