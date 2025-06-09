package com.entity.view;

import com.entity.JuhuibaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 聚会报名
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 15:20:53
 */
@TableName("juhuibaoming")
public class JuhuibaomingView  extends JuhuibaomingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JuhuibaomingView(){
	}
 
 	public JuhuibaomingView(JuhuibaomingEntity juhuibaomingEntity){
 	try {
			BeanUtils.copyProperties(this, juhuibaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
