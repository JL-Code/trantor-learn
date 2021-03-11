package org.mecode.trantor.poc.api.model;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import lombok.Data;

import java.util.Date;

/**
 * <p>创建时间: 2021/2/25 </p>
 *
 * @author <a href="mailto:jiangy@highzap.com" rel="nofollow">蒋勇</a>
 * @version v1.0
 */
@Data
@TModel(name = "用户信息")
public class User extends BaseModel<Long> {
    private static final long serialVersionUID = 1L;

    @TModelField(name = "用户名", nullable = false)
    private String name;

    @TModelField(name = "邮箱")
    private String email;

    @TModelField(name = "电话")
    private String phone;

    @TModelField(name = "生日")
    private Date birthday;
}