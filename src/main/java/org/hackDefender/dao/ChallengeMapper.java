package org.hackDefender.dao;

import org.hackDefender.pojo.Challenge;

import java.util.List;

public interface ChallengeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Challenge record);

    int insertSelective(Challenge record);

    Challenge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Challenge record);

    int updateByPrimaryKey(Challenge record);

    int checkId(Integer challengeId);

    List<Challenge> selectAll();

    Challenge selectByName(String name);

    String selectScript(Integer challengeId);

    String selectCmdByid(Integer challengeId);

    String selectCheckByid(Integer challengeId);

    String selectRemotePathByid(Integer challengeId);
}