package com.taotao.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.EUDataGridResult;
import com.taotao.common.TaotaoResult;
import com.taotao.mapper.TbItemParamMapper;
import com.taotao.pojo.TbItemParam;
import com.taotao.pojo.TbItemParamExample;
import com.taotao.pojo.TbItemParamExample.Criteria;
import com.taotao.service.ItemParamService;

/**
 * 商品管理service
 * 
 * @author paperpass
 *
 */
@Service
@Transactional
public class ItemParamServiceImpl implements ItemParamService {
	
    @Autowired
	private TbItemParamMapper itemParamMapper;

	/**
	 * 商品列表查询
	 */
	@Override
	public EUDataGridResult getItemParamList(int page, int rows) {
		// 分页处理
		PageHelper.startPage(page, rows);
		List<TbItemParam> list = itemParamMapper.selectAll();
		// 创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		// 取记录总条数
		PageInfo<TbItemParam> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}
	
	@Override
	public TaotaoResult queryCatalogById(long cid) throws Exception {
		
		//根据cid查询数据库
		TbItemParamExample example = new TbItemParamExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemCatIdEqualTo(cid);
		List<TbItemParam> list = itemParamMapper.selectByExampleWithBLOBs(example);
		//如果查询中有结果返回查询结果
		if (list != null && !list.isEmpty()) {
			return TaotaoResult.ok(list.get(0));
		}
		//查询成功但是没有查到数据
		return TaotaoResult.ok();
	}
	
	@Override
	public TaotaoResult saveItemParam(long cid, String itemParam) throws Exception {
		//创建TbItemParam对象
		TbItemParam param = new TbItemParam();
		param.setItemCatId(cid);
		param.setParamData(itemParam);
		param.setCreated(new Date());
		param.setUpdated(new Date());
		//向数据库添加数据
		itemParamMapper.insert(param);
		
		return TaotaoResult.ok();
		
	}

}
