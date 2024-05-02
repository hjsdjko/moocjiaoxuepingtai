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


import com.dao.DiscusskewaizhishiDao;
import com.entity.DiscusskewaizhishiEntity;
import com.service.DiscusskewaizhishiService;
import com.entity.vo.DiscusskewaizhishiVO;
import com.entity.view.DiscusskewaizhishiView;

@Service("discusskewaizhishiService")
public class DiscusskewaizhishiServiceImpl extends ServiceImpl<DiscusskewaizhishiDao, DiscusskewaizhishiEntity> implements DiscusskewaizhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskewaizhishiEntity> page = this.selectPage(
                new Query<DiscusskewaizhishiEntity>(params).getPage(),
                new EntityWrapper<DiscusskewaizhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskewaizhishiEntity> wrapper) {
		  Page<DiscusskewaizhishiView> page =new Query<DiscusskewaizhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskewaizhishiVO> selectListVO(Wrapper<DiscusskewaizhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskewaizhishiVO selectVO(Wrapper<DiscusskewaizhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskewaizhishiView> selectListView(Wrapper<DiscusskewaizhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskewaizhishiView selectView(Wrapper<DiscusskewaizhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
