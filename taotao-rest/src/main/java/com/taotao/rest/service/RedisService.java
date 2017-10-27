package com.taotao.rest.service;

import com.taotao.common.TaotaoResult;

public interface RedisService {

	TaotaoResult syncContent(long contentCid);
}
