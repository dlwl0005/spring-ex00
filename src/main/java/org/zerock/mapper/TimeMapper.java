package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	public String getTime2();

}

//Ŭ���� �ε�
//Ŀ�ؼ� ����
//statment ���
//query ����

//select sysdate form dual

//resultSet ó��
//Ŀ�ؼ� �ݰ�
