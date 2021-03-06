package com.taotao.service;

import com.taotao.common.EUDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	TbItem getItemById(long itemId);
	
	EUDataGridResult getItemList(int page, int rows);
	
	void saveItem(TbItem item, String desc, String itemParams)throws Exception;

}
