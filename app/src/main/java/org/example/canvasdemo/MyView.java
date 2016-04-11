package org.example.canvasdemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

public class MyView extends View{
	
	Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.pacman);
	ArrayList<Coins> coin = new ArrayList<Coins>();
    //The coordinates for our dear pacman: (0,0) is the top-left corner
	int pacx = 50;
    int pacy = 400;
    int h,w; //used for storing our height and width

	public void setGoldCoins(ArrayList<Coins> coins){
		this.coin = coins;
	}

	// random coins
	public void Coins() {

	}
    
    // move left
	public void moveLeft(int x)
    {
    	//still within our boundaries?
    	if (pacx>0)
    		pacx=pacx+-x;
    	invalidate(); //redraw everything
    }

	// move right
	public void moveRight(int x)
	{
		//still within our boundaries?
		if (pacx+x+bitmap.getWidth()<w)
			pacx=pacx+x;
		invalidate(); //redraw everything
	}

	// move up
	public void moveUp(int y)
	{
		//still within our boundaries?
		if (pacy>0)
			pacy=pacy-y;
		invalidate(); //redraw everything
	}

	// move down
	public void moveDown(int y)
	{
		//still within our boundaries?
		if (pacy+y+bitmap.getHeight()<h)
			pacy=pacy+y;
		invalidate(); //redraw everything
	}

	/* The next 3 constructors are needed for the Android view system,
	when we have a custom view.
	 */
	public MyView(Context context) {
		super(context);
		
	}
	
	public MyView(Context context, AttributeSet attrs) {
		super(context,attrs);
	}
	
	
	public MyView(Context context, AttributeSet attrs, int defStyleAttr)
	{
		super(context,attrs,defStyleAttr);
	}

	//In the onDraw we put all our code that should be
	//drawn whenever we update the screen.
	@Override
	protected void onDraw(Canvas canvas) {  
		//Here we get the height and weight
		h = canvas.getHeight();
		w = canvas.getWidth();
		System.out.println("h = "+h+", w = "+w);
		//Making a new paint object
		Paint paint = new Paint();
		//setting the color
		paint.setColor(Color.RED);
		canvas.drawColor(Color.WHITE); //clear entire canvas to white color
		//drawing a line from (0,0) -> (300,200)
		/*canvas.drawLine(0,0,300,200,paint);
		paint.setColor(Color.GREEN);
		canvas.drawLine(0,200,300,0,paint);*/
		
		//setting the color using the format: Transparency, Red, Green, Blue
		paint.setColor(0xff000099);
		
		//drawing a circle with radius 20, and center in (100,100) 
		//canvas.drawCircle(100,100,20,paint);

		for(Coins coins : coin) canvas.drawCircle(coins.getxCircle(), coins.getyCircle(), 20, paint);
		
		canvas.drawBitmap(bitmap, pacx, pacy, paint);
		super.onDraw(canvas);
	}

}
