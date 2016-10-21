package com.bekup.materialtabs.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by TRIPOD STUDIO on 10/22/2016.
 */

public class ThreeFragment extends BaseFragment {

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setTextView("THREE");
    }
}
