/*******************************************************
 * Copyright 2011 - 2013 HuoLi Tek Corp., Ltd.
 * All rights reserved.
 *
 * Description	:
 * History  	:
 * (ID, Date, Author, Description)
 *
 *******************************************************/
package cn.yueying.teashop.model;

import cn.yueying.waterfalllibrary.model.ImageReadableObj;

/**
 * @author LuoJ@huoLi.com
 * 
 */
public class TeaModel implements ImageReadableObj {

	private String imageUrl;
	private int width;
	private int height;

	public TeaModel(String imageUrl, int width, int height) {
		this.imageUrl = imageUrl;
		this.width = width;
		this.height = height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.yueying.waterfalllibrary.model.ImageReadableObj#getImageUrl()
	 */
	@Override
	public String getImageUrl() {
		return imageUrl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.yueying.waterfalllibrary.model.ImageReadableObj#getImageWidth()
	 */
	@Override
	public int getImageWidth() {
		return width;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.yueying.waterfalllibrary.model.ImageReadableObj#getImageHeight()
	 */
	@Override
	public int getImageHeight() {
		return height;
	}

}
