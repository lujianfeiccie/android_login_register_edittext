package com.example.login_register_edittext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;

/**
版权所有：版权所有(C)2013，固派软件
文件名称：com.goopai.shenma.custom.drawBottomEditText.java
系统编号：
系统名称：Shenma
模块编号：
模块名称：
设计文档：
创建日期：2013-12-20 下午5:52:39
作 者：何鹏程
Version: 1.0
内容摘要：能够具有底部边框的以及两边短条的EditText
类中的代码包括三个区段：类变量区、类属性区、类方法区。
文件调用:
 */
public class drawBottomEditText extends AbstractEditText {

	public drawBottomEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		setDefaultPaint();
	}

	private Paint mPaint=new Paint();;
	
	public drawBottomEditText(Context context) {
		this(context,null);
	}

	@Override
	protected void filterText(CharSequence s, int start, int before, int count) {
	}
	
	public void setPainterColor(int color){
		mPaint.setColor(color);
	}
	
	public void setPainterWidth(float w){
		mPaint.setStrokeWidth(w);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		//画两边竖条
		canvas.drawLine(0, this.getHeight()-1,0,this.getHeight()-10, mPaint);
		canvas.drawLine(getWidth()-2, this.getHeight()-1,getWidth()-2,this.getHeight()-10, mPaint);
		// 画底线  
        canvas.drawLine(1, this.getHeight() - 1, this.getWidth() - 2, this.getHeight() - 1, mPaint);
	}
	
	private void setDefaultPaint(){
		mPaint.setColor(getResources().getColor(R.color.login_default_painter_color));
		mPaint.setStyle(Style.STROKE);
		mPaint.setStrokeWidth(2.5f);
	}

}
