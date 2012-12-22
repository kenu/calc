package uos.android.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView textView;
	Boolean isStarted = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView = (TextView) findViewById(R.id.textView1);
		
		Button button1 = (Button)findViewById(R.id.button1);

		button1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				checkMode();
				textView.setText(textView.getText() + "1");
			}
		});
		Button button2 = (Button)findViewById(R.id.button2);
		
		button2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				checkMode();
				textView.setText(textView.getText() + "2");
			}
		});
		Button button3 = (Button)findViewById(R.id.button3);
		
		button3.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				checkMode();
				textView.setText(textView.getText() + "3");
			}
		});
		Button button4 = (Button)findViewById(R.id.button4);
		
		button4.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				checkMode();
				textView.setText(textView.getText() + "4");
			}
		});
		Button button5 = (Button)findViewById(R.id.button5);
		
		button5.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				checkMode();
				textView.setText(textView.getText() + "5");
			}
		});
		Button button6 = (Button)findViewById(R.id.button6);
		
		button6.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				checkMode();
				textView.setText(textView.getText() + "6");
			}
		});
		Button button7 = (Button)findViewById(R.id.button7);
		
		button7.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				checkMode();
				textView.setText(textView.getText() + "7");
			}
		});
		Button button8 = (Button)findViewById(R.id.button8);
		
		button8.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				checkMode();
				textView.setText(textView.getText() + "8");
			}
		});
		Button button9 = (Button)findViewById(R.id.button9);
		
		button9.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				checkMode();
				textView.setText(textView.getText() + "9");
			}
		});
		Button button0 = (Button)findViewById(R.id.button0);
		
		button0.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				checkMode();
				textView.setText(textView.getText() + "0");
			}
		});
		Button buttonplus = (Button)findViewById(R.id.buttonplus);
		
		buttonplus.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				checkMode();
				textView.setText(textView.getText() + "+");
			}
		});
		Button buttonequal = (Button)findViewById(R.id.buttonequal);
		
		buttonequal.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0) {
				textView.setText(getResult());
				isStarted = false;
			}
		});

	}

	protected CharSequence getResult() {
		String text = textView.getText().toString();
		String[] array = text.split("\\+");
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result += Integer.parseInt(array[i]);
		}
		return String.valueOf(result);
	}

	public void checkMode() {
		if (!isStarted) {
			textView.setText("");
			isStarted = true;
		}
	}

}
