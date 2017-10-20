package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.EUDataGridResult;
import com.taotao.common.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemParamService;
import com.taotao.service.ItemService;

@Controller
@RequestMapping("/item/param")
public class ItemParamController {
	
	@Autowired
	private ItemParamService itemParamService;
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getItemList(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "30") Integer rows) {
		EUDataGridResult result = itemParamService.getItemParamList(page, rows);
		return result;
	}
	
	@RequestMapping("query/itemcatid/{cid}")
	@ResponseBody
	public TaotaoResult queryCatalogById(@PathVariable long cid) throws Exception {
		//根据分类id查询列表
		TaotaoResult result = itemParamService.queryCatalogById(cid);
		return result;
	}
	
	@RequestMapping("/save/{cid}")
	@ResponseBody
	public TaotaoResult saveItemParam(@PathVariable Long cid, String paramData) throws Exception {
		TaotaoResult result = itemParamService.saveItemParam(cid, paramData);
		return result;
	}
}
