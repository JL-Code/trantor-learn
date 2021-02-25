package org.mecode.trantor.poc.server.repository;

/**
 * <p>创建时间: 2021/2/25 </p>
 *
 * @author <a href="mailto:jiangy@highzap.com" rel="nofollow">蒋勇</a>
 * @version v1.0
 */

import io.terminus.trantor.sdk.autumn.Selectable;
import io.terminus.trantor.sdk.autumn.dao.TrantorDAO;
import org.mecode.trantor.poc.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户 dao, 须继承 TrantorDAO，默认已包含 CRUD 操作
 *
 * @author zhengdong.jzd@alibaba-inc.com
 * @date 2020/7/13
 */
@Repository
public class UserRepository extends TrantorDAO<User, Long> {
    public List<User> findAll() {
        return find(Selectable::selectAll);
    }
}
