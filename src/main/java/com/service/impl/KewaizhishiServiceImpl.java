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


import com.dao.KewaizhishiDao;
import com.entity.KewaizhishiEntity;
import com.service.KewaizhishiService;
import com.entity.vo.KewaizhishiVO;
import com.entity.view.KewaizhishiView;

@Service("kewaizhishiService")
public class KewaizhishiServiceImpl extends ServiceImpl<KewaizhishiDao, KewaizhishiEntity> implements KewaizhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KewaizhishiEntity> page = this.selectPage(
                new Query<KewaizhishiEntity>(params).getPage(),
                new EntityWrapper<KewaizhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KewaizhishiEntity> wrapper) {
		  Page<KewaizhishiView> page =new Query<KewaizhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KewaizhishiVO> selectListVO(Wrapper<KewaizhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KewaizhishiVO selectVO(Wrapper<KewaizhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KewaizhishiView> selectListView(Wrapper<KewaizhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KewaizhishiView selectView(Wrapper<KewaizhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
