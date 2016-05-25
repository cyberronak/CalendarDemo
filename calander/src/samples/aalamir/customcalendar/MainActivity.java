package samples.aalamir.customcalendar;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.widget.PopupMenu;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class MainActivity extends ActionBarActivity {

	private HashSet<Date> events = new HashSet<>();
	private CalendarView cv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date1 = dateformat3.parse("21/05/2016");

			events.add(new Date());
			events.add(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cv = ((CalendarView) findViewById(R.id.calendar_view));
		cv.updateCalendar(events);

		// assign event handler
		cv.setEventHandler(new CalendarView.EventHandler() {
			
			@Override
			public void onDayLongPress(Date date, View view) {
				// TODO Auto-generated method stub
				// // show returned day
				// DateFormat df = SimpleDateFormat.getDateInstance();
				// Toast.makeText(MainActivity.this, df.format(date),
				// Toast.LENGTH_SHORT).show();
				
			}
		});

	}

	private void addEvent(View v)
	{
		
		
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
