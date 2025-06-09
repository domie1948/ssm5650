package com.dao;

import com.entity.XiaoyoufengcaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyoufengcaiVO;
import com.entity.view.XiaoyoufengcaiView;


/**
 * 校友风采
 * 
 * @author 
 * @email 
 * @date 2021-03-12 15:20:53
 */
public interface XiaoyoufengcaiDao extends BaseMapper<XiaoyoufengcaiEntity> {
	
	List<XiaoyoufengcaiVO> selectListVO(@Param("ew") Wrapper<XiaoyoufengcaiEntity> wrapper);
	
	XiaoyoufengcaiVO selectVO(@Param("ew") Wrapper<XiaoyoufengcaiEntity> wrapper);
	
	List<XiaoyoufengcaiView> selectListView(@Param("ew") Wrapper<XiaoyoufengcaiEntity> wrapper);

	List<XiaoyoufengcaiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyoufengcaiEntity> wrapper);
	
	XiaoyoufengcaiView selectView(@Param("ew") Wrapper<XiaoyoufengcaiEntity> wrapper);
	
}
