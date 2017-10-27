package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.EUDataGridResult;
import com.taotao.common.HttpClientUtil;
import com.taotao.common.TaotaoResult;
import com.taotao.pojo.TbContent;
import com.taotao.service.ContentService;

@Controller
@RequestMapping("/content")
public class ContentController {
	
	@Autowired
	private ContentService contentService;
	
	
	@RequestMapping("/query/list")
	@ResponseBody
	public EUDataGridResult getContentList(Long categoryId, Integer page, Integer rows) throws Exception {
		EUDataGridResult result = contentService.getContentList(categoryId, page, rows);
		
		return result;
		
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public TaotaoResult addContent(TbContent content) throws Exception {
		TaotaoResult result = contentService.addContent(content);
		return result;
	}
	
	@RequestMapping("/edit")
	@ResponseBody
	public TaotaoResult editContent(TbContent content) throws Exception {
		//修改首页广告内容
		TaotaoResult result =contentService.editContent(content);
		return result;
	}
}