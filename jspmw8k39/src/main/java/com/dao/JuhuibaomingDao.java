package com.dao;

import com.entity.JuhuibaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JuhuibaomingVO;
import com.entity.view.JuhuibaomingView;


/**
 * 聚会报名
 * 
 * @author 
 * @email 
 * @date 2021-03-12 15:20:53
 */
public interface JuhuibaomingDao extends BaseMapper<JuhuibaomingEntity> {
	
	List<JuhuibaomingVO> selectListVO(@Param("ew") Wrapper<JuhuibaomingEntity> wrapper);
	
	JuhuibaomingVO selectVO(@Param("ew") Wrapper<JuhuibaomingEntity> wrapper);
	
	List<JuhuibaomingView> selectListView(@Param("ew") Wrapper<JuhuibaomingEntity> wrapper);

	List<JuhuibaomingView> selectListView(Pagination page,@Param("ew") Wrapper<JuhuibaomingEntity> wrapper);
	
	JuhuibaomingView selectView(@Param("ew") Wrapper<JuhuibaomingEntity> wrapper);
	
}
