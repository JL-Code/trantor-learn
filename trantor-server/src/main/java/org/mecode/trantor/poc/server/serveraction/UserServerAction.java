package org.mecode.trantor.poc.server.serveraction;

import io.terminus.platform.sdk.transaction.DSTransaction;
import io.terminus.trantor.api.annotation.RootModel;
import io.terminus.trantor.api.annotation.TAction;
import io.terminus.trantor.api.annotation.params.TParam;
import lombok.extern.slf4j.Slf4j;
import org.mecode.trantor.poc.api.model.User;
import org.mecode.trantor.poc.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>创建时间: 2021/2/25 </p>
 *
 * @author <a href="mailto:jiangy@highzap.com" rel="nofollow">蒋勇</a>
 * @version v1.0
 */
@Slf4j
@Component
public class UserServerAction {
    @Autowired
    private UserRepository userRepository;

    /**
     * 批量修改用户邮箱
     *
     * @param email 批量修改的邮箱
     */
    @TAction(modelClass = User.class)
    @DSTransaction
    public void batchUpdateName(@TParam("email") String email) {
        List<Long> ids = userRepository.findAll().stream().map(RootModel::getId).collect(Collectors.toList());
        User user = new User();
        user.setEmail(email);
        userRepository.updateManyIgnoreRelationSkipNull(ids, user);
    }
}