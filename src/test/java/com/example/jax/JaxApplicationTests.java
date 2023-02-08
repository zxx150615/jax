package com.example.jax;

import com.example.jax.chain.common.ResultVo;
import com.example.jax.chain.director.Chain;
import net.minidev.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class JaxApplicationTests {

    @Autowired
    Chain chain;

    @Test
    void testChain() {
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        List<ResultVo> resultList = new ArrayList<>();
        System.out.println(chain.doProcess(resultList, ids).getMsg());
        System.out.printf(Arrays.toString(resultList.toArray()));
    }

}
