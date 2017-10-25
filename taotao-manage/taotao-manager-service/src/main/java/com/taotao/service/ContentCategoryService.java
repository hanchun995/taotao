package com.taotao.service;

import java.util.List;

import com.taotao.common.EasyUITreeNode;
import com.taotao.common.TaotaoResult;

public interface ContentCategoryService {
	List<EasyUITreeNode> getContentCategoryList(long parentid) throws Exception;
	
	TaotaoResult addNode(long parentid, String name) throws Exception;
}
