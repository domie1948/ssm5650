package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyoufengcaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyoufengcaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyoufengcaiView;


/**
 * 校友风采
 *
 * @author 
 * @email 
 * @date 2021-03-12 15:20:53
 */
public interface XiaoyoufengcaiService extends IService<XiaoyoufengcaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyoufengcaiVO> selectListVO(Wrapper<XiaoyoufengcaiEntity> wrapper);
   	
   	XiaoyoufengcaiVO selectVO(@Param("ew") Wrapper<XiaoyoufengcaiEntity> wrapper);
   	
   	List<XiaoyoufengcaiView> selectListView(Wrapper<XiaoyoufengcaiEntity> wrapper);
   	
   	XiaoyoufengcaiView selectView(@Param("ew") Wrapper<XiaoyoufengcaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyoufengcaiEntity> wrapper);
   	
}

