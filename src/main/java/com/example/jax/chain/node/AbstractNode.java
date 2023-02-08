package com.example.jax.chain.node;

import com.example.jax.chain.common.ResultVo;
import com.example.jax.common.ResultResp;

import java.util.List;

public abstract class AbstractNode {

    protected void toAddResultList(List<ResultVo> resultList, Integer code, String msg) {
        ResultVo vo = new ResultVo(code, msg);
        resultList.add(vo);
    }

    //模板处理方法
    public ResultResp handle(List<ResultVo> resultList, List<Integer> ids) {
        return null;
    }

}
