package com.taotao.service;

import com.taotao.common.EUDataGridResult;
import com.taotao.common.TaotaoResult;
import com.taotao.pojo.TbItem;

public interface ItemParamService {
	EUDataGridResult getItemParamList(int page, int rows);

	TaotaoResult queryCatalogById(long cid) throws Exception;
	
	TaotaoResult saveItemParam(long cid, String itemParam) throws Exception;
}
