package com.entity.view;

import com.entity.XiaoyoufengcaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校友风采
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 15:20:53
 */
@TableName("xiaoyoufengcai")
public class XiaoyoufengcaiView  extends XiaoyoufengcaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyoufengcaiView(){
	}
 
 	public XiaoyoufengcaiView(XiaoyoufengcaiEntity xiaoyoufengcaiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyoufengcaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
