package com.fun_play.app.utils;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public abstract class BaseNewsObserver<T> implements Observer<T> {

    public abstract void onSuccess(T t);

    public abstract void onFail(Throwable e);

    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }

    @Override
    public void onNext(@NonNull T t) {
        onSuccess(t);
    }

    @Override
    public void onError(@NonNull Throwable e) {
        onFail(e);
    }

    @Override
    public void onComplete() {

    }
}
