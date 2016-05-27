package samples.aalamir.customcalendar;

import java.util.Date;

import samples.aalamir.customcalendar.CalendarData.EventType;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public class ConstantUtility {

	public static final String DATE_FORMATE = "dd/MM/yyyy";

	// Compare two date equal or not
	@SuppressWarnings("deprecation")
	public static boolean dateCompare(Date date1,Date date2) {
		if(date1.getDate() == date2.getDate() && date1.getMonth() == date2.getMonth() && date1.getYear() == date2.getYear())
			return true;
		
		return false;
	}
	

	public static String getColorCodeFromEventType(EventType eventType) {
		// TODO Auto-generated method stub
		if (eventType == EventType.Event) {
			return "#AB47BC";
		} else if (eventType == EventType.Exam) {
			return "#26A69A";
		} else {
			return "#42A5F5";
		}
	}

	
	// Change image(bitmap) color
	public static Bitmap changeImageColor(Drawable sourceDrawable, String color) {
		//Convert drawable in to bitmap
        Bitmap sourceBitmap = convertDrawableToBitmap(sourceDrawable);
        
        Bitmap resultBitmap = Bitmap.createBitmap(sourceBitmap, 0, 0,  
        sourceBitmap.getWidth() - 1, sourceBitmap.getHeight() - 1);    
        Paint p = new Paint();
        ColorFilter filter = new LightingColorFilter(Color.parseColor(color), 1);
        p.setColorFilter(filter);
 
        Canvas canvas = new Canvas(resultBitmap);
        canvas.drawBitmap(resultBitmap, 0, 0, p);
        return resultBitmap;
    }
 
 
 	// Convert drawable to bitmap
    public static Bitmap convertDrawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
 
        Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), 
        drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
 
        return bitmap;
    }
}
