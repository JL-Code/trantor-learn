package org.mecode.trantor.poc.server.dataaction;

import io.terminus.trantor.sdk.datasource.MultiDataAction;
import io.terminus.trantor.sdk.datasource.MultiDataParams;
import io.terminus.trantor.sdk.datasource.MultiDataResult;
import org.mecode.trantor.poc.api.model.Subject;
import org.mecode.trantor.poc.server.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>创建时间: 2021/3/19 </p>
 *
 * @author <a href="mailto:jiangy@highzap.com" rel="nofollow">蒋勇</a>
 * @version v1.0
 */
@Component
public class SubjectDataAction implements MultiDataAction<Subject> {

    @Autowired
    SubjectRepository repository;


    @Override
    public MultiDataResult<Subject> load(MultiDataParams multiDataParams) {
//        int pageNo = multiDataParams.getPaging() != null ? multiDataParams.getPaging().getNo() : 1;
//        int pageSize = multiDataParams.getPaging() != null ? multiDataParams.getPaging().getSize() : 10;
//
//        Paging<Student> solutions = studentRepo.page(conditionSet -> {
//
//        }, pageNo, pageSize);
//
//        return new MultiDataResult<>(solutions.getData(), solutions.getTotal());
        return null;
    }
}
