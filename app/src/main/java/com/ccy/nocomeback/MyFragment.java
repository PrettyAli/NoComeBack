package com.ccy.nocomeback;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends BackHandledFragment {

    private boolean hadIntercept;

    @Override
    public boolean onBackPressed() {
        //if (hadIntercept) {
        return false;
//        } else {
//            Toast.makeText(getActivity(), "Click MyFragment", Toast.LENGTH_SHORT).show();
//            hadIntercept = true;
//            return true;
//        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
