package com.health.mapper;

import com.health.bean.Member;
import com.health.bean.MemberExample;

import java.util.List;

import com.health.vo.MemberQueryVO;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    int countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

    /* 查询会员信息*/
    List<MemberQueryVO> queryMemberInfo(String queryString);

    /* 根据时间查询会员的注册数量*/
    Integer countMemberByMonth(String date);
}