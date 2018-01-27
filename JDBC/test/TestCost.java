package com.tarena.test;
import java.sql.Date;
import com.tarena.entity.Cost;
public class TestCost {
	public static void main(String[] args) {
		  Cost c1=new Cost();
		  c1.setId(1);
		  c1.setName("包20小时");
		  c1.setBaseDuration(20);
		  c1.setBaseCost(24.5);
		  c1.setUnitCost(0.01);
		  c1.setDescr("包20小时-24.5-0.01");
		  Date d1=Date.valueOf("2014-01-01");
		  c1.setCreateTime(d1);
		  System.out.print(c1);
	}

    
}
