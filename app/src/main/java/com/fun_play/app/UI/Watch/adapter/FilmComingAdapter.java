package com.fun_play.app.UI.Watch.adapter;
import android.view.ViewGroup;

import com.fun_play.app.R;
import com.fun_play.app.base.BaseAdapter.BaseRecyclerViewAdapter;
import com.fun_play.app.base.BaseAdapter.BaseRecyclerViewHolder;
import com.fun_play.app.databinding.ItemFilmComingBinding;
import com.fun_play.app.datamanager.bean.watch.ComingFilmBean;
import com.fun_play.app.utils.DensityUtil;

public class FilmComingAdapter extends BaseRecyclerViewAdapter<ComingFilmBean.MoviecomingsBean> {

    private int width;

    public FilmComingAdapter() {
        int px = DensityUtil.dip2px(36);
        width = (DensityUtil.getDisplayWidth() - px) / 3;
    }

    @Override
    public BaseRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(parent, R.layout.item_film_coming);
    }

    class ViewHolder extends BaseRecyclerViewHolder<ComingFilmBean.MoviecomingsBean, ItemFilmComingBinding> {

        ViewHolder(ViewGroup parent, int layout) {
            super(parent, layout);
        }

        @Override
        public void onBindViewHolder(final ComingFilmBean.MoviecomingsBean bean, final int position) {
            binding.setBean(bean);
            DensityUtil.formatHeight(binding.imCover, width, 0.758f, 1);
        }
    }
}