package com.dao;

import com.entity.KewaizhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KewaizhishiVO;
import com.entity.view.KewaizhishiView;


/**
 * 课外知识
 * 
 * @author 
 * @email 
 * @date 2021-02-22 15:48:18
 */
public interface KewaizhishiDao extends BaseMapper<KewaizhishiEntity> {
	
	List<KewaizhishiVO> selectListVO(@Param("ew") Wrapper<KewaizhishiEntity> wrapper);
	
	KewaizhishiVO selectVO(@Param("ew") Wrapper<KewaizhishiEntity> wrapper);
	
	List<KewaizhishiView> selectListView(@Param("ew") Wrapper<KewaizhishiEntity> wrapper);

	List<KewaizhishiView> selectListView(Pagination page,@Param("ew") Wrapper<KewaizhishiEntity> wrapper);
	
	KewaizhishiView selectView(@Param("ew") Wrapper<KewaizhishiEntity> wrapper);
	
}
