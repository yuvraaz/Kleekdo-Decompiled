package com.app.elitesample.services;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleyHelper
{
  private static VolleyHelper INSTANCE;
  private Context context;
  private RequestQueue requestQueue;
  
  private VolleyHelper(Context paramContext)
  {
    this.context = paramContext;
    this.requestQueue = getRequestQueue();
  }
  
  public static VolleyHelper getInstance(Context paramContext)
  {
    try
    {
      if (INSTANCE == null) {
        INSTANCE = new VolleyHelper(paramContext);
      }
      paramContext = INSTANCE;
      return paramContext;
    }
    finally {}
  }
  
  public <T> void addToRequestQueue(Request<T> paramRequest)
  {
    getRequestQueue().add(paramRequest);
  }
  
  public void cancelRequest(String paramString)
  {
    getRequestQueue().cancelAll(paramString);
  }
  
  public RequestQueue getRequestQueue()
  {
    if (this.requestQueue == null) {
      this.requestQueue = Volley.newRequestQueue(this.context.getApplicationContext());
    }
    return this.requestQueue;
  }
}


/* Location:              D:\dex2jar-2.0\classes-dex2jar.jar!\com\app\elitesample\services\VolleyHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */