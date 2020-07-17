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
 * 检测订单记录表
 * </p>
 *
 * @author wangyz
 * @since 2020-07-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="CheckBase对象", description="检测订单记录表")
public class CheckBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "testOrder表的id")
    private Integer orderId;

    @ApiModelProperty(value = "检测编号")
    private String number;

    @ApiModelProperty(value = "检测状态 1待分配、2待确认、3待检测、4待审批、5通过、6驳回、7复勘、8已撤销")
    private Integer checkStatus;

    @ApiModelProperty(value = "检测客服")
    private Integer checkCall;

    @ApiModelProperty(value = "预约时间")
    private LocalDateTime appointTime;

    @ApiModelProperty(value = "备注")
    private String objRemark;

    @ApiModelProperty(value = "数据状态 0：无效 1：有效 - 判断检测是否撤销")
    private Integer objStatus;

    @ApiModelProperty(value = "补充备注")
    private String addRemark;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime objCreatedate;

    @ApiModelProperty(value = "创建人ID")
    private Integer objCreateuser;

    @ApiModelProperty(value = "最后修改时间")
    private LocalDateTime objModifydate;

    @ApiModelProperty(value = "最后修改人ID")
    private Integer objModifyuser;

    @ApiModelProperty(value = "机构售后user_id ")
    private Integer obtainUserId;

    @ApiModelProperty(value = "预约客户姓名")
    private String clientName;

    @ApiModelProperty(value = "预约客户电话")
    private String clientPhone;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "转化成交状态  1.成功 2.失败")
    private Integer isDeal;

    @ApiModelProperty(value = "经销商id")
    private Integer dealId;

    @ApiModelProperty(value = "经销商名称")
    private String dealName;

    @ApiModelProperty(value = "检测撤销原因 1.客户主动 2.客户被动 3.其他")
    private Integer cancelReason;

    @ApiModelProperty(value = "检测撤销备注")
    private String cancelRemark;

    @ApiModelProperty(value = "是否上传人店合影 1.是 2.否")
    private Integer isPhotoshop;


}
