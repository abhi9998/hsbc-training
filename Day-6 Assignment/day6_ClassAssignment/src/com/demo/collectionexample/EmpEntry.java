package com.demo.collectionexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
//100,Abhi,Junagadh,45000
//101,Abhi2,Junagadh2,505555
//103,Abhi4,Junagadh4,234554
//103,Abhi4,Junagadh4,234554
public class EmpEntry {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		HashSet<Emp> employees = new HashSet<Emp>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter from 4 employee details seperated by comma like");
		System.out.println("EmpID,Name,City,Salary");
		String line ="";
		while(!(line=br.readLine()).equals("")) {
			System.out.println();
			String data[] = line.split(",");
			System.out.println("value is "+data[0]);
			Emp e = new Emp(Integer.valueOf(data[0]),data[1],data[2],Double.valueOf(data[3]));
			
			employees.add(e);
		}
		
		
		Emp temp = new Emp(103,"Abhi4","Junagadh4",234554);
		System.out.println(employees.size());
		employees.add(temp);
		//employees.remove(new Emp(103,"Abhi4","Junagadh4",234554));
		System.out.println(employees.size());
		
		System.out.println(employees.contains(temp));
		System.out.println("hiiiii");
		System.out.println(employees);
		Iterator<Emp> itr = employees.iterator();
		while(itr.hasNext()) {
			Emp e = itr.next();
			System.out.println(e);
		}
		
		for(Emp s: employees) {
			System.out.println(s);
		}
	}

}
