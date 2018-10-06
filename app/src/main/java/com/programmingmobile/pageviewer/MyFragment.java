package com.programmingmobile.pageviewer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyFragment extends Fragment {
	public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";
	public static final String IMAGE_MESSAGE = "EXTRA_MESSAGE";
	
	public static final MyFragment newInstance(String message, String image)
	{
		MyFragment fragment = new MyFragment();
		Bundle bdl = new Bundle();
	    bdl.putString(EXTRA_MESSAGE, message);
	    bdl.putString(IMAGE_MESSAGE, image);
	    fragment.setArguments(bdl);
	    return fragment;
	}

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {
		String message = getArguments().getString(EXTRA_MESSAGE);
		String image = getArguments().getString(IMAGE_MESSAGE);
		View v = inflater.inflate(R.layout.myfragment_layout, container, false);
		TextView messageTextView = v.findViewById(R.id.textView);
		ImageView imageView = v.findViewById(R.id.imageView);
		messageTextView.setText(message);
		imageView.setImageResource(getResources().getIdentifier(image,"drawable",getActivity().getPackageName()));
        return v;
    }
}
