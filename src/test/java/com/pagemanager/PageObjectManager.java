package com.pagemanager;

import com.pages.AmazonPage;
import com.pages.DemoQAPage;
import com.pages.FlipkartPage;

public class PageObjectManager {
	
	
	
	private AmazonPage amazonPage;
	private FlipkartPage flipkartPage;
	private DemoQAPage demoQAPage;
	
	public AmazonPage getAmazonPage() {
		
		
		return (amazonPage==null)?amazonPage=new AmazonPage():amazonPage;
	}
	
	public FlipkartPage getFlipkartPage() {
		
		
		return (flipkartPage==null)?flipkartPage=new FlipkartPage():flipkartPage;
	}
	
	public DemoQAPage getDemoQAPage() {
		
		
		return (demoQAPage==null)?demoQAPage=new DemoQAPage():demoQAPage;
	}
	
	
	
	
	

}
