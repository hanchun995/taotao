package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.EUDataGridResult;
import com.taotao.common.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemParamItemService;
import com.taotao.service.ItemParamService;
import com.taotao.service.ItemService;

@Controller
/* @RequestMapping("/item/param") */
public class ItemParamItemController {

	@Autowired
	private ItemParamItemService itemParamItemService;

	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getItemParamItemList(Integer page, Integer rows) {
		EUDataGridResult result = itemParamItemService.getItemParamItemList(page, rows);
		System.out.println(result);
		return result;
	}

	@RequestMapping("/items/param/item/{itemId}")
	public String getItemParamItemById(@PathVariable Long itemId, Model model) {
		String itemParamItem = itemParamItemService.geParamItemByItemId(itemId);
		model.addAttribute("param1", itemParamItem);
		return "item-param-show";
	}
}
