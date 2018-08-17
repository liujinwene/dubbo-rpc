package com.abc.rpc.service;

import com.abc.rpc.dto.req.GetContentRpcReqDTO;
import com.abc.rpc.dto.resp.ContentRpcRespDTO;
import com.abc.rpc.dto.resp.base.BaseRpcRespDTO;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by liujinwen on 2018-08-06
 */
@Service(timeout = 5000)
public class ContentRpcServiceImpl implements ContentRpcService {

    @Override
    public BaseRpcRespDTO<ContentRpcRespDTO> getContent(GetContentRpcReqDTO reqDTO) {
        throw new RuntimeException("test exception");
//        ContentRpcRespDTO respDTO = ContentRpcRespDTO.builder()
//                .id("123")
//                .name("test")
//                .desc("demo lo")
//                .build();
//        return BaseRpcRespDTO.success(respDTO);
    }
}
