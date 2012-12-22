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
				String string = ((Button)v).getText().toString();
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
