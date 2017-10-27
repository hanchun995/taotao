package com.taotao.service;

import com.taotao.common.EUDataGridResult;
import com.taotao.common.TaotaoResult;
import com.taotao.pojo.TbContent;

public interface ContentService {

	EUDataGridResult getContentList(long catId, Integer page, Integer rows) throws Exception;
	
	TaotaoResult addContent(TbContent content) throws Exception;
	
	TaotaoResult editContent(TbContent content) throws Exception;
}
