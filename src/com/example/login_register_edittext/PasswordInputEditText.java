package com.example.login_register_edittext;

import android.content.Context;
import android.util.AttributeSet;

/**
版权所有：版权所有(C)2013，固派软件
文件名称：com.goopai.shenma.login.PasswordInputEditText.java
系统编号：
系统名称：Shenma
模块编号：
模块名称：
设计文档：
创建日期：2013-12-20 上午10:05:57
作 者：何鹏程
Version: 1.0
内容摘要：自定义密码输入框
类中的代码包括三个区段：类变量区、类属性区、类方法区。
文件调用:
 */
public class PasswordInputEditText extends drawBottomEditText{

	public PasswordInputEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public PasswordInputEditText(Context context) {
		// TODO Auto-generated constructor stub
		this(context, null);
	}

	@Override
	protected void filterText(CharSequence s, int start, int before, int count) {
		// TODO Auto-generated method stub

	}

}
