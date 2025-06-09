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


import com.dao.XiaoyoufengcaiDao;
import com.entity.XiaoyoufengcaiEntity;
import com.service.XiaoyoufengcaiService;
import com.entity.vo.XiaoyoufengcaiVO;
import com.entity.view.XiaoyoufengcaiView;

@Service("xiaoyoufengcaiService")
public class XiaoyoufengcaiServiceImpl extends ServiceImpl<XiaoyoufengcaiDao, XiaoyoufengcaiEntity> implements XiaoyoufengcaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyoufengcaiEntity> page = this.selectPage(
                new Query<XiaoyoufengcaiEntity>(params).getPage(),
                new EntityWrapper<XiaoyoufengcaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyoufengcaiEntity> wrapper) {
		  Page<XiaoyoufengcaiView> page =new Query<XiaoyoufengcaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyoufengcaiVO> selectListVO(Wrapper<XiaoyoufengcaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyoufengcaiVO selectVO(Wrapper<XiaoyoufengcaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyoufengcaiView> selectListView(Wrapper<XiaoyoufengcaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyoufengcaiView selectView(Wrapper<XiaoyoufengcaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
