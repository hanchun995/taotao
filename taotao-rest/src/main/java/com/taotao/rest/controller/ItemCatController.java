package com.taotao.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.CatResult;
import com.taotao.common.JsonUtils;
import com.taotao.rest.service.ItemCatService;

@Controller
@RequestMapping("/itemcat")
public class ItemCatController {

	
	@Autowired
	private ItemCatService itemCatService;

	@RequestMapping(value="/all", method = RequestMethod.GET,produces= "application/json;charset=utf-8")
	@ResponseBody
	public String getItemCatList(String callback) {
		CatResult catResult = itemCatService.getItemCatList();
		//把pojo转换成字符串
		String json = JsonUtils.objectToJson(catResult);
		//拼装返回值
		String result = callback + "(" + json + ");";
		return result;
	}
}
