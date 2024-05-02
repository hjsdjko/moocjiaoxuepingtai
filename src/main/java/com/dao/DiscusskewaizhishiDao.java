package com.dao;

import com.entity.DiscusskewaizhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskewaizhishiVO;
import com.entity.view.DiscusskewaizhishiView;


/**
 * 课外知识评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-22 15:48:18
 */
public interface DiscusskewaizhishiDao extends BaseMapper<DiscusskewaizhishiEntity> {
	
	List<DiscusskewaizhishiVO> selectListVO(@Param("ew") Wrapper<DiscusskewaizhishiEntity> wrapper);
	
	DiscusskewaizhishiVO selectVO(@Param("ew") Wrapper<DiscusskewaizhishiEntity> wrapper);
	
	List<DiscusskewaizhishiView> selectListView(@Param("ew") Wrapper<DiscusskewaizhishiEntity> wrapper);

	List<DiscusskewaizhishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskewaizhishiEntity> wrapper);
	
	DiscusskewaizhishiView selectView(@Param("ew") Wrapper<DiscusskewaizhishiEntity> wrapper);
	
}
