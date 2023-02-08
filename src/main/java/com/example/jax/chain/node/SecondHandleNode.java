package com.example.jax.chain.node;

import com.example.jax.chain.common.ResultVo;
import com.example.jax.common.ResultResp;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SecondHandleNode extends AbstractNode {


    @Override
    public ResultResp handle(List<ResultVo> resultList, List<Integer> ids) {
        if (!ids.contains(2)) {
            toAddResultList(resultList, 1, "第二步处理失败");
            return ResultResp.builderFailure("第二步处理失败");
        } else {
            return ResultResp.builderSuccess();
        }
    }
}
