package com.example.tick.myapplication.Mine.Presenter.Impl;

import android.util.SparseArray;

import com.example.tick.myapplication.Mine.Entity.BackCode;
import com.example.tick.myapplication.Mine.Model.Imple.ChangePwModelImpl;
import com.example.tick.myapplication.Mine.Model.MineModel;
import com.example.tick.myapplication.Mine.Presenter.MineListener;
import com.example.tick.myapplication.Mine.Presenter.MinePresenter;
import com.example.tick.myapplication.Mine.View.MineView;

/**
 * Created by Tick on 2016/9/19.
 */
public class ChangePwImpl implements MinePresenter,MineListener {
    private MineView mineView;
    private MineModel mineModel;
    public ChangePwImpl(MineView mineView) {
        this.mineView = mineView;
        mineModel = new ChangePwModelImpl();
    }

    @Override
    public void onSuccess(Object backCode) {
        mineView.hideDialog();
        mineView.showSuccess(backCode);
    }

    @Override
    public void onFailed(String mess) {
        mineView.hideDialog();
        mineView.showError();
    }

    @Override
    public void backDate(Object o, Object o2) {

    }


    @Override
    public void postUser(Object array) {
        mineView.showDialog();
        mineModel.doCheck(array,this);
    }



}
