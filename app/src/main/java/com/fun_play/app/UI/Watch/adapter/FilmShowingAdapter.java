package com.fun_play.app.UI.Watch.adapter;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;

import com.fun_play.app.R;
import com.fun_play.app.base.BaseAdapter.BaseRecyclerViewAdapter;
import com.fun_play.app.base.BaseAdapter.BaseRecyclerViewHolder;
import com.fun_play.app.databinding.ItemFilmShowingBinding;
import com.fun_play.app.datamanager.bean.watch.FilmItemBean;
import com.nineoldandroids.view.ViewHelper;
import com.nineoldandroids.view.ViewPropertyAnimator;

public class FilmShowingAdapter extends BaseRecyclerViewAdapter<FilmItemBean> {

    @NonNull
    @Override
    public BaseRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(parent, R.layout.item_film_showing);
    }

    private class ViewHolder extends BaseRecyclerViewHolder<FilmItemBean,ItemFilmShowingBinding> {

        ViewHolder(ViewGroup context, int layoutId) {
            super(context, layoutId);
        }

        @Override
        public void onBindViewHolder(final FilmItemBean positionData, final int position) {
            if (positionData != null) {
                binding.setBean(positionData);
                ViewHelper.setScaleX(itemView, 0.8f);
                ViewHelper.setScaleY(itemView, 0.8f);
                ViewPropertyAnimator.animate(itemView).scaleX(1).setDuration(350).setInterpolator(new OvershootInterpolator()).start();
                ViewPropertyAnimator.animate(itemView).scaleY(1).setDuration(350).setInterpolator(new OvershootInterpolator()).start();
            }
        }
    }
}
