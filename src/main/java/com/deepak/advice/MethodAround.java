/**
 * 
 */
package com.deepak.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author deepak
 * 
 */
public class MethodAround implements MethodInterceptor {

	public Object invoke(MethodInvocation method) throws Throwable {
		System.out.println("Method name : " + method.getMethod().getName());
		System.out.println("Method arguments : "
				+ Arrays.toString(method.getArguments()));
		System.out.println("Called before method call");
		try {
			Object result = method.proceed();
			System.out.println("Called after method call");
			return result;
		} catch (Exception e) {
			System.out.println("Called before exception handeling");
			throw e;
		}
	}
}
