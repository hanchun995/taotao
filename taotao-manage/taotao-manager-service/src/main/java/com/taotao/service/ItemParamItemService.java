package com.taotao.service;

import com.taotao.common.EUDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemParamItemService {
	EUDataGridResult getItemParamItemList(int page, int rows);
	
	String geParamItemByItemId(long itemId);
}
