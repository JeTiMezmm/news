package com.example.firstweektest1;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private Button bt1;
	private ImageView iv;
	private int count=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
		initData();
	}
	private void initData() {
		// TODO Auto-generated method stub
		bt1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(count%2==0){
					iv.setVisibility(View.INVISIBLE);
					count++;
				}
				else{
					iv.setVisibility(View.VISIBLE);
					count++;
				}
			}
		});
	}
	private void init() {
		// TODO Auto-generated method stub
		bt1=(Button) findViewById(R.id.bt1);
		iv=(ImageView) findViewById(R.id.iv);
	}

}
