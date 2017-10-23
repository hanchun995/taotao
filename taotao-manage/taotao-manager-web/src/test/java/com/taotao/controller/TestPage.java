package com.taotao.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;

public class TestPage {
	
	@Test
	public void testPageHelper() {
	/*	//鍒涘缓涓�釜spring瀹瑰櫒
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		//浠巗pring瀹瑰櫒涓幏寰桵apper鐨勪唬鐞嗗璞�
		TbItemMapper mapper = applicationContext.getBean(TbItemMapper.class);
		//鎵ц鏌ヨ锛屽苟鍒嗛〉
		TbItemExample example = new TbItemExample();
		//鍒嗛〉澶勭悊
		PageHelper.startPage(1, 10);
		List<TbItem> list = mapper.selectByExample(example);
		//鍙栧晢鍝佸垪琛�
		for (TbItem tbItem : list) {
			System.out.println(tbItem.getTitle());
		}
		//鍙栧垎椤典俊鎭�
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();*/
		//System.out.println("鍏辨湁鍟嗗搧锛�+ total);
		
	}
}
