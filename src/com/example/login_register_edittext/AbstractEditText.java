package com.example.login_register_edittext;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;

/**
版权所有：版权所有(C)2013，固派软件
文件名称：com.goopai.carshop.ui.custom.BaseEditText.java
系统编号：
系统名称：4S_Android
模块编号：
模块名称：
设计文档：
创建日期：2013-11-18 下午8:45:24
作 者：何鹏程
Version: 1.0
内容摘要：自定义输入文本框基类，实现了对输入内容的过滤
类中的代码包括三个区段：类变量区、类属性区、类方法区。
文件调用:
 */
public abstract class AbstractEditText extends EditText implements TextWatcher{

	public AbstractEditText(Context context, AttributeSet attrs) {
		// TODO Auto-generated constructor stub
		super(context,attrs);
		this.addTextChangedListener(this);
	}

	public AbstractEditText(Context context) {
		// TODO Auto-generated constructor stub
		this(context, null);
	}

	@Override
	public void afterTextChanged(Editable s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		// TODO Auto-generated method stub
		filterText(s, start, before, count);
	}
	
	protected abstract void filterText(CharSequence s, int start, int before, int count);

}
