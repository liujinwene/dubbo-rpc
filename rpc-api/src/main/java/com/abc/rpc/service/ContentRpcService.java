package com.abc.rpc.service;

import com.abc.rpc.dto.req.GetContentRpcReqDTO;
import com.abc.rpc.dto.resp.ContentRpcRespDTO;
import com.abc.rpc.dto.resp.base.BaseRpcRespDTO;

/**
 * 内容相关rpc接口
 * Created by liujinwen on 2018-08-02
 */
public interface ContentRpcService {
    /**
     * 获取内容
     * @param reqDTO
     * @return
     */
    BaseRpcRespDTO<ContentRpcRespDTO> getContent(GetContentRpcReqDTO reqDTO);
}
