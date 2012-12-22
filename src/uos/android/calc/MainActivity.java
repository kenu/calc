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
		Button button2 = (Button)findViewById(R.id.button2);
		Button button3 = (Button)findViewById(R.id.button3);
		Button button4 = (Button)findViewById(R.id.button4);
		Button button5 = (Button)findViewById(R.id.button5);
		Button button6 = (Button)findViewById(R.id.button6);
		Button button7 = (Button)findViewById(R.id.button7);
		Button button8 = (Button)findViewById(R.id.button8);
		Button button9 = (Button)findViewById(R.id.button9);
		Button button0 = (Button)findViewById(R.id.button0);
		Button buttonplus = (Button)findViewById(R.id.buttonplus);
		Button buttonequal = (Button)findViewById(R.id.buttonequal);

		View.OnClickListener listener = new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				checkMode();
				String string = "1";
				switch (v.getId()) {
				case R.id.button1:
					string = "1";
					break;
				case R.id.button2:
					string = "2";
					break;
				case R.id.button3:
					string = "3";
					break;
				case R.id.button4:
					string = "4";
					break;
				case R.id.button5:
					string = "5";
					break;
				case R.id.button6:
					string = "6";
					break;
				case R.id.button7:
					string = "7";
					break;
				case R.id.button8:
					string = "8";
					break;
				case R.id.button9:
					string = "9";
					break;
				case R.id.button0:
					string = "0";
					break;
				case R.id.buttonplus:
					string = "+";
					break;

				default:
					break;
				}
				textView.setText(textView.getText() + string);
			}
		};
		button1.setOnClickListener(listener);
		button2.setOnClickListener(listener);
		button3.setOnClickListener(listener);
		button4.setOnClickListener(listener);
		button5.setOnClickListener(listener);
		button6.setOnClickListener(listener);
		button7.setOnClickListener(listener);
		button8.setOnClickListener(listener);
		button9.setOnClickListener(listener);
		button0.setOnClickListener(listener);
		buttonplus.setOnClickListener(listener);
		
		buttonequal.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
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
