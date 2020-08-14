package com.jt.pojo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Ljz
 * @date   2020-08-12
 * @TableName : 关联表关系
 * @Accessors: 表示链式加载
 * @JsonIgnoreProperties(ignoreUnknown=true):表示JSON转化时忽略未知属性
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@TableName("tb_item")
@Data
@Accessors(chain=true)
public class Item extends BasePojo{
	@TableId(type=IdType.AUTO)
	/** 商品ID */
	private Long id;
	/** 商品标题 */
	private String title;
	/** 商品卖点信息 */
	private String sellPoint;
	/** 商品价格 */
	private Long   price;
	/** 商品数量 */
	private Integer num;
	/** 条形码 */
	private String barcode;
	/** 商品图片信息 */
	private String image;
	/** 表示商品的分类id */
	private Long   cid;
	/** 1正常，2下架 */
	private Integer status;

	/**
	 * 	为了满足页面调用需求,添加get方法
	 */
	public String[] getImages(){
		
		return image.split(",");
	}
}
