package com.entity.vo;

import com.entity.XiaoyoufengcaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 校友风采
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-12 15:20:53
 */
public class XiaoyoufengcaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 风光事迹
	 */
	
	private String fengguangshiji;
		
	/**
	 * 在校时间
	 */
	
	private String zaixiaoshijian;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：风光事迹
	 */
	 
	public void setFengguangshiji(String fengguangshiji) {
		this.fengguangshiji = fengguangshiji;
	}
	
	/**
	 * 获取：风光事迹
	 */
	public String getFengguangshiji() {
		return fengguangshiji;
	}
				
	
	/**
	 * 设置：在校时间
	 */
	 
	public void setZaixiaoshijian(String zaixiaoshijian) {
		this.zaixiaoshijian = zaixiaoshijian;
	}
	
	/**
	 * 获取：在校时间
	 */
	public String getZaixiaoshijian() {
		return zaixiaoshijian;
	}
			
}
