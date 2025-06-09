package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JuhuibaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JuhuibaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JuhuibaomingView;


/**
 * 聚会报名
 *
 * @author 
 * @email 
 * @date 2021-03-12 15:20:53
 */
public interface JuhuibaomingService extends IService<JuhuibaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JuhuibaomingVO> selectListVO(Wrapper<JuhuibaomingEntity> wrapper);
   	
   	JuhuibaomingVO selectVO(@Param("ew") Wrapper<JuhuibaomingEntity> wrapper);
   	
   	List<JuhuibaomingView> selectListView(Wrapper<JuhuibaomingEntity> wrapper);
   	
   	JuhuibaomingView selectView(@Param("ew") Wrapper<JuhuibaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JuhuibaomingEntity> wrapper);
   	
}

