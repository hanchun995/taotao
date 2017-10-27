package com.taotao.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.taotao.common.JsonUtils;
import com.taotao.common.StringUtils;
import com.taotao.common.TaotaoResult;
import com.taotao.mapper.TbContentMapper;
import com.taotao.pojo.TbContent;
import com.taotao.pojo.TbContentExample;
import com.taotao.pojo.TbContentExample.Criteria;
import com.taotao.rest.service.ContentService;
import com.taotao.rest.service.JedisClient;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private TbContentMapper contentMapper;
	
	@Autowired
	private JedisClient jedisClient;
	
	@Value("${INDEX_CONTENT_REDIS_KEY}")  
    private String INDEX_CONTENT_REDIS_KEY; 
	
	@Override
	public TaotaoResult getContentList(long cid) throws Exception {
		
		//从缓存中取内容
	/*	try {
			String result = jedisClient.hget(INDEX_CONTENT_REDIS_KEY, cid + "");
			if (!StringUtils.isNull(result)) {
				//把字符串转换成list
				List<TbContent> resultList = JsonUtils.jsonToList(result, TbContent.class);
				return TaotaoResult.ok(resultList);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		
		TbContentExample example = new TbContentExample();
		//添加条件
		Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(cid);
		List<TbContent> list = contentMapper.selectByExample(example);
		
		//向缓存中添加内容
	/*	try {
			//把list转换成字符串
			String cacheString = JsonUtils.objectToJson(list);
			jedisClient.hset(INDEX_CONTENT_REDIS_KEY, cid + "", cacheString);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		return TaotaoResult.ok(list);
	}
}