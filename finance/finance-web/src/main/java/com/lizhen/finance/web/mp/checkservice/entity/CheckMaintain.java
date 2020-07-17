package com.lizhen.finance.web.mp.checkservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 检测保养表
 * </p>
 *
 * @author wangyz
 * @since 2020-07-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="CheckMaintain对象", description="检测保养表")
public class CheckMaintain implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "检测id")
    private Integer checkId;

    @ApiModelProperty(value = "是否保养：1.是；2否")
    private Integer isMaintain;

    @ApiModelProperty(value = "保养内容")
    private String maintainContent;

    @ApiModelProperty(value = "保养金额")
    private Double maintainMoney;

    @ApiModelProperty(value = "备注")
    private String objRemark;

    @ApiModelProperty(value = "数据状态 0：无效 1：有效")
    private Integer objStatus;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime objCreatedate;

    @ApiModelProperty(value = "创建人ID")
    private Integer objCreateuser;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime objModifydate;

    @ApiModelProperty(value = "最后修改人ID")
    private Integer objModifyuser;


}
