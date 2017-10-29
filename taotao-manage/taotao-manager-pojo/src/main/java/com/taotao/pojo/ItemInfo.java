package com.taotao.pojo;

import com.taotao.pojo.TbItem;

public class ItemInfo extends TbItem {
	private String images;
	public void setImages(String images){
		this.images=images;
	}
	public String[] getImages() {
		String image = getImage();
		if (image != null) {
			String[] images = image.split(",");
			return images;
		}
		return null;
	}
}