package com.example.jax.chain.node;

import com.example.jax.chain.common.ResultVo;
import com.example.jax.common.ResultResp;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FirstHandleNode extends AbstractNode {

    @Override
    public ResultResp handle(List<ResultVo> resultList, List<Integer> ids) {


        if (!ids.contains(1)) {
            toAddResultList(resultList, 1, "第一步处理失败");
            return ResultResp.builderSuccess("第一步处理失败");
        } else {
            return ResultResp.builderSuccess();
        }
    }
}
