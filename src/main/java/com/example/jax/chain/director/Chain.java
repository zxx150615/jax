package com.example.jax.chain.director;

import com.example.jax.chain.common.ResultVo;
import com.example.jax.chain.node.AbstractNode;
import com.example.jax.chain.node.FirstHandleNode;
import com.example.jax.chain.node.SecondHandleNode;
import com.example.jax.common.ResultResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Chain {

    @Autowired(required=false)
    FirstHandleNode firstNode;

    @Autowired(required=false)
    SecondHandleNode secondNode;

    private  List<AbstractNode> nodes = new ArrayList<>();

    public ResultResp doProcess(List<ResultVo> resultVos, List<Integer> ids) {
        nodes.add(firstNode);
        nodes.add(secondNode);
        ResultResp res = null;
        for (AbstractNode node : nodes) {
            ResultResp resp = node.handle(resultVos, ids);
            res = resp;
            if (resp.getCode().equals(ResultResp.FAIL)) {
                break;
            }
        }
        return res;
    }

}
