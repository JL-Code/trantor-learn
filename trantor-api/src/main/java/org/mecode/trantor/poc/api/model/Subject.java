package org.mecode.trantor.poc.api.model;

/**
 * <p>创建时间: 2021/3/18 </p>
 *
 * @author <a href="mailto:jiangy@highzap.com" rel="nofollow">蒋勇</a>
 * @version v1.0
 */

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import lombok.Data;

@Data
@TModel(name = "科目信息")
public class Subject extends BaseModel<String> {
    private static final long serialVersionUID = 1L;
    @TModelField(name = "父级科目编码")
    private String parentCode;
    @TModelField(name = "科目编码")
    private String subjectCode;
    @TModelField(name = "科目层级")
    private int level;
    @TModelField(name = "是否产品成本")
    private boolean isProductCost;
    @TModelField(name = "备注")
    private String remarks;
    @TModelField(name = "科目名称")
    private String subjectName;
    @TModelField(name = "科目类型")
    private String subjectType;
    @TModelField(name = "科目ID")
    private String subjectId;
    @TModelField(name = "是否受控")
    private String isControlled;
}