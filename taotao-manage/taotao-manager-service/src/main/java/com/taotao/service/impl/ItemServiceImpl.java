package com.taotao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

/**
 * 商品管理service
 * @author paperpass
 *
 */
@Service
@Transactional
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper tbItemMapper;
	
	@Override
	public TbItem getItemById(long itemId) {
		return tbItemMapper.selectByPrimaryKey(itemId);
	}

}
