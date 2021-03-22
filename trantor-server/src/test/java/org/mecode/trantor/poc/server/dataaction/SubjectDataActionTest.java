package org.mecode.trantor.poc.server.dataaction;

import io.terminus.trantor.framework.test.TSpringRunner;
import io.terminus.trantor.sdk.datasource.MultiDataResult;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mecode.trantor.poc.api.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * <p>创建时间: 2021/3/22 </p>
 *
 * @author <a href="mailto:jiangy@highzap.com" rel="nofollow">蒋勇</a>
 * @version v1.0
 */
@RunWith(TSpringRunner.class)
@SpringBootTest
public class SubjectDataActionTest extends TestCase {

    @Autowired
    SubjectDataAction dataAction;

    /**
     * 1. 树拼接
     */
    @Test
    public void testLoad() {
        MultiDataResult<Subject> result = dataAction.load(null);
    }
}