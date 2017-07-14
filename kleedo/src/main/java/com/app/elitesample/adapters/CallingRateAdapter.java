package com.app.elitesample.adapters;

import android.content.Context;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.SectionIndexer;
import com.android.volley.VolleyLog;
import java.util.List;

public class CallingRateAdapter
  extends ArrayAdapter<String>
  implements SectionIndexer
{
  public CallingRateAdapter(Context paramContext, int paramInt, List<String> paramList)
  {
    super(paramContext, paramInt, paramList);
  }
  
  public int getPositionForSection(int paramInt)
  {
    Log.d(VolleyLog.TAG, "getPositionForSection " + paramInt);
    return (int)(getCount() * (paramInt / getSections().length));
  }
  
  public int getSectionForPosition(int paramInt)
  {
    return 0;
  }
  
  public Object[] getSections()
  {
    String[] arrayOfString = new String[SideSelector.ALPHABET.length];
    int i = 0;
    while (i < SideSelector.ALPHABET.length)
    {
      arrayOfString[i] = String.valueOf(SideSelector.ALPHABET[i]);
      i += 1;
    }
    return arrayOfString;
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\adapters\CallingRateAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */