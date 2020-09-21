package com.demo.interfaces;

import java.io.IOException;

import com.demo.entity.Emp;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public interface EmpDao {

	public String save(Emp e) throws EmpAlreadyExistsException ;
}
