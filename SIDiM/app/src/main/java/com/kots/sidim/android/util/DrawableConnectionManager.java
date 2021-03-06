package com.kots.sidim.android.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.kots.sidim.android.config.ConfigGlobal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;

public class DrawableConnectionManager {

	public DrawableConnectionManager() {
	}

	public Bitmap fetchDrawable(String urlString) {
		
		urlString = ConfigGlobal.BASE_URL_PHOTOS + urlString;

		if (SessionUserSidim.images.containsKey(urlString)) {
			return SessionUserSidim.images.get(urlString);
		}
		Bitmap bitmap = null;

		Log.d(this.getClass().getSimpleName(), "image url:" + urlString);
		try {
			InputStream is = fetch(urlString);
			Drawable drawable2 = Drawable.createFromStream(is, "src");
			bitmap = ((BitmapDrawable) drawable2).getBitmap();

			if (bitmap != null) {
				SessionUserSidim.images.put(urlString, bitmap);
			} else {
				Log.w(this.getClass().getSimpleName(),
						"could not get thumbnail");
			}
		} catch (MalformedURLException e) {
			Log.e(this.getClass().getSimpleName(), "fetchDrawable failed", e);
		} catch (IOException e) {
			Log.e(this.getClass().getSimpleName(), "fetchDrawable failed", e);
			throw new NumberFormatException();
		}
		return bitmap;
	}

	public void fetchDrawableOnThread(String urlString,
			final ImageView imageView) {
		
		urlString = ConfigGlobal.BASE_URL_PHOTOS + urlString;
		final String urlFinal = urlString;
		
		if (SessionUserSidim.images.containsKey(urlString)) {
			imageView.setImageBitmap(SessionUserSidim.images.get(urlString));
			Log.i("DrawableConnectionManagger", "Already download " + urlString);
		}

		final Handler handler = new Handler() {
			@Override
			public void handleMessage(Message message) {
			
				imageView.setImageBitmap((Bitmap) message.obj);
			}
		};

		Thread thread = new Thread() {
			@Override
			public void run() {
				Bitmap drawable;
				try {
					drawable = drawableFromUrl(urlFinal);
					SessionUserSidim.images.put(urlFinal, drawable);
					Message message = handler.obtainMessage(1, drawable);
					handler.sendMessage(message);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		};
		thread.start();
	}

	public static Bitmap drawableFromUrl(String url) throws IOException {

		Bitmap x;

		HttpURLConnection connection = (HttpURLConnection) new URL(url)
				.openConnection();
		connection.connect();
		InputStream input = connection.getInputStream();

		x = BitmapFactory.decodeStream(input);
		return x;
	}

	private InputStream fetch(String urlString) throws MalformedURLException,
			IOException {

		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet request = new HttpGet(urlString);
		HttpResponse response = httpClient.execute(request);
		return response.getEntity().getContent();
	}

}
