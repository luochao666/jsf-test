package com.booway.jsf.bean;

import java.util.Random;




public class UserBean 
{
	// 正确答案数字
	private int keyNumber;
	// 用户输入数字
	private int userNumber;
	// 最小值
	private int minNum = 0;
	// 最大值
	private int maxNum = 10;
	
	// 回应客户的信息字符串
	private String responseStr;
	
	public UserBean(){
		Random random = new Random();
		keyNumber = random.nextInt();
		System.out.println("正确数字是：" + keyNumber);
	}

	public int getKeyNumber()
	{
		return keyNumber;
	}

	public void setKeyNumber(int keyNumber)
	{
		this.keyNumber = keyNumber;
	}

	public int getUserNumber()
	{
		return userNumber;
	}

	public void setUserNumber(int userNumber)
	{
		this.userNumber = userNumber;
	}

	public int getMinNum()
	{
		return minNum;
	}

	public void setMinNum(int minNum)
	{
		this.minNum = minNum;
	}

	public int getMaxNum()
	{
		return maxNum;
	}

	public void setMaxNum(int maxNum)
	{
		this.maxNum = maxNum;
	}

	public String getResponseStr()
	{
		if (userNumber == keyNumber)
		{
			return "您猜对了";
		}else {
			return "对不起，猜错了！";
		}
		
	}

	public void setResponseStr(String responseStr)
	{
		this.responseStr = responseStr;
	}
	
	



	
	
	
	

}
