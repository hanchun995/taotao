package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.EasyUITreeNode;
import com.taotao.common.TaotaoResult;
import com.taotao.service.ContentCategoryService;

@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {

	@Autowired
	private ContentCategoryService contentCategoryService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<EasyUITreeNode> getContentCategoryList(@RequestParam(value="id", defaultValue="0")long parentid) throws Exception {
		List<EasyUITreeNode> list = contentCategoryService.getContentCategoryList(parentid);	
		return list;
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public TaotaoResult addNode(Long parentId, String name) throws Exception {
		
		TaotaoResult result = contentCategoryService.addNode(parentId, name);
		
		return result;
	}
}