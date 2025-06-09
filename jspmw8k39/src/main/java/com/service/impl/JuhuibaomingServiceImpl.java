package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JuhuibaomingDao;
import com.entity.JuhuibaomingEntity;
import com.service.JuhuibaomingService;
import com.entity.vo.JuhuibaomingVO;
import com.entity.view.JuhuibaomingView;

@Service("juhuibaomingService")
public class JuhuibaomingServiceImpl extends ServiceImpl<JuhuibaomingDao, JuhuibaomingEntity> implements JuhuibaomingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JuhuibaomingEntity> page = this.selectPage(
                new Query<JuhuibaomingEntity>(params).getPage(),
                new EntityWrapper<JuhuibaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JuhuibaomingEntity> wrapper) {
		  Page<JuhuibaomingView> page =new Query<JuhuibaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JuhuibaomingVO> selectListVO(Wrapper<JuhuibaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JuhuibaomingVO selectVO(Wrapper<JuhuibaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JuhuibaomingView> selectListView(Wrapper<JuhuibaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JuhuibaomingView selectView(Wrapper<JuhuibaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
