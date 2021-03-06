package com.sebastianrask.bettersubscription.misc;

import android.graphics.Bitmap;

import com.squareup.picasso.Target;

/**
 * Created by Sebastian Rask on 09-05-2016.
 */
public abstract class PreviewTarget implements Target {
	private Bitmap preview;

	public Bitmap getPreview() {
		return preview;
	}

	public void setPreview(Bitmap preview) {
		this.preview = preview;
	}
}
