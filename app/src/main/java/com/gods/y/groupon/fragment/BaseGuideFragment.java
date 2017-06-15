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
 * Created by Administrator on 2017/6/15 0015.
 */

public abstract class BaseGuideFragment extends Fragment {

    @BindView(R.id.skip)
    Button skip;
    Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(getFLayout(), container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    public abstract int getFLayout();

    @OnClick(R.id.skip)
    public void setSkip() {
        startActivity(new Intent(getActivity(), MainActivity.class));
        getActivity().finish();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
