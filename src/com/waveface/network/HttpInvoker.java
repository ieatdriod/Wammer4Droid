package com.waveface.network;

import java.io.InputStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

public class HttpInvoker {
	private static final String TAG = "Wammer";
	/**
	 * 
	 * @param url
	 * @return
	 */
	public static InputStream getInputStreamFromUrl(String url) throws Exception {
		InputStream content = null;
		try {
			content = retryStream(url,0);
//			HttpGet request = new HttpGet(url);
//			request.setHeader("User-Agent", "Android");
//			HttpClient httpclient = new DefaultHttpClient();
//			HttpResponse response = httpclient.execute(request);
//			content = response.getEntity().getContent();
		} catch (Exception e) {
			Log.d("[GET REQUEST]", "Network exception", e);
			throw e;
		}
		return content;
	}
	public static InputStream retryStream(String url,int count) throws Exception{
		InputStream content = null;
		int countLimit = 3;
		try {
			if(count < countLimit){
			Log.d(TAG, "URL(time:"+(count+1)+"):"+url);			
				HttpGet request = new HttpGet(url);
				request.setHeader("User-Agent", "Android");
				HttpClient httpclient = new DefaultHttpClient();
				HttpResponse response = httpclient.execute(request);
				content = response.getEntity().getContent();
			}
		} catch (Exception e) {
			Log.d("[GET REQUEST]", "Network exception", e);
			count ++;
			content = retryStream(url,count);
			throw e;						
		}		
		return content;
	}

	/**
	 * 
	 * @param url
	 * @return
	 */
	public static String getStringFromUrl(String url) throws Exception  {
		String content = null;
		try {
			content = retry(url,0);
		} catch (Exception e) {
			Log.d("[GET REQUEST]", "Network exception", e);
			throw e;
		}
		return content;
	}
	public static String retry(String url,int count) throws Exception{
		String content = "";
		int countLimit = 3;
		try {
			if(count < countLimit){
			Log.d(TAG, "URL(time:"+(count+1)+"):"+url);			
				HttpGet request = new HttpGet(url);
				request.setHeader("User-Agent", "Android");
				HttpClient httpclient = new DefaultHttpClient();
				HttpResponse response = httpclient.execute(request);
				content = EntityUtils.toString(response.getEntity());
			}
		} catch (Exception e) {
			Log.d("[GET REQUEST]", "Network exception", e);
			count ++;
			content = retry(url,count);
			throw e;						
		}		
		return content;
	}
   public static Bitmap LoadImage(String URL, BitmapFactory.Options options)
   {       
	   Bitmap bitmap = null; 
       try {    	   
           bitmap = BitmapFactory.decodeStream(getInputStreamFromUrl(URL), null, options);
       } catch (Exception e1) {
    	   e1.printStackTrace();
       }
       return bitmap;               
   }
   public static Bitmap LoadImage(InputStream is)
   {       
    BitmapFactory.Options bmOptions = new BitmapFactory.Options();
    //bmOptions.inSampleSize = 1;	
    bmOptions.inTargetDensity = 1; 
    bmOptions.inDensity = 1;
	   
	   Bitmap bitmap = null; 
       try {    	   
           bitmap = BitmapFactory.decodeStream(is, null, bmOptions);
       } catch (Exception e1) {
    	   e1.printStackTrace();
       }
       return bitmap;               
   }

}

