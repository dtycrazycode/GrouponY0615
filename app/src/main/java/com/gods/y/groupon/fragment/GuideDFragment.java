package com.gods.y.groupon.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gods.y.groupon.R;
import com.gods.y.groupon.ui.MainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class GuideDFragment extends BaseGuideFragment {

    @Override
    public int getFLayout() {
        return R.layout.fragment_guide_d;
    }
}
