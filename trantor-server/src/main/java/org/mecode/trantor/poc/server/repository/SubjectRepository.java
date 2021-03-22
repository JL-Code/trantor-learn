package org.mecode.trantor.poc.server.repository;

import io.terminus.trantor.sdk.autumn.dao.TrantorDAO;
import org.mecode.trantor.poc.api.model.Subject;
import org.springframework.stereotype.Repository;

/**
 * <p>创建时间: 2021/3/19 </p>
 *
 * @author <a href="mailto:jiangy@highzap.com" rel="nofollow">蒋勇</a>
 * @version v1.0
 */
@Repository
public class SubjectRepository extends TrantorDAO<Subject, String> {

}
