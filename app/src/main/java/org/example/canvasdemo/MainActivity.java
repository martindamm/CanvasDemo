package org.example.canvasdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends Activity {
	
	MyView myView;
	ArrayList<Coins> coin = new ArrayList<Coins>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button = (Button) findViewById(R.id.moveLeft);
		myView = (MyView) findViewById(R.id.gameView);
		coin.add(new Coins());
		coin.add(new Coins());
		coin.add(new Coins());
		coin.add(new Coins());
		coin.add(new Coins());
		coin.add(new Coins());
		coin.add(new Coins());
		coin.add(new Coins());



		myView.setGoldCoins(coin);
		//listener of our pacman
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				myView.moveLeft(10);
			}
		});
		button = (Button) findViewById(R.id.moveRight);
		myView = (MyView) findViewById(R.id.gameView);
		//listener of our pacman
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				myView.moveRight(10);
			}
		});
		button = (Button) findViewById(R.id.moveUp);
		myView = (MyView) findViewById(R.id.gameView);
		//listener of our pacman
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				myView.moveUp(10);
			}
		});
		button = (Button) findViewById(R.id.moveDown);
		myView = (MyView) findViewById(R.id.gameView);
		//listener of our pacman
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				myView.moveDown(10);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
