package com.tarena.test;
import com.tarena.dao.*;
import com.tarena.entity.*;
import java.util.*;
public class TestCostDao {
public static void main(String[] args) {
	CostDao dao=new CostDao();
	List<Cost> costs=dao.selectAll();
	for(int i=0;i<costs.size();i++) {
		Cost cost=costs.get(i);
	 System.out.println(cost);
	}
	
}
}
