package com.kevinrschultz.weatherbuoy.ui;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.kevinrschultz.weatherbuoy.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class BuoyListingFragment extends Fragment implements View.OnClickListener {

    private Button testButton;

    public static BuoyListingFragment makeBuoyListingFragment() {
        return new BuoyListingFragment();
    }

    public BuoyListingFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_buoy_listing, container, false);
        testButton = Button.class.cast(v.findViewById(R.id.test_button));
        testButton.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.test_button:
                Intent intent = BuoyDetailActivity.makeBuoyDetailIntent(getActivity());
                startActivity(intent);
                break;
        }
    }
}
