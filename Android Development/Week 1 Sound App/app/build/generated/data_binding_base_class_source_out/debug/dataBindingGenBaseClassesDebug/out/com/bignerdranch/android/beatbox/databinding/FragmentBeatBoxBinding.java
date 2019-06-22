package com.bignerdranch.android.beatbox.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bignerdranch.android.beatbox.BeatBox;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentBeatBoxBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerView;

  @Bindable
  protected BeatBox mViewModel;

  protected FragmentBeatBoxBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerView = recyclerView;
  }

  public abstract void setViewModel(@Nullable BeatBox viewModel);

  @Nullable
  public BeatBox getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentBeatBoxBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_beat_box, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBeatBoxBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentBeatBoxBinding>inflateInternal(inflater, com.bignerdranch.android.beatbox.R.layout.fragment_beat_box, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBeatBoxBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_beat_box, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentBeatBoxBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentBeatBoxBinding>inflateInternal(inflater, com.bignerdranch.android.beatbox.R.layout.fragment_beat_box, null, false, component);
  }

  public static FragmentBeatBoxBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentBeatBoxBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentBeatBoxBinding)bind(component, view, com.bignerdranch.android.beatbox.R.layout.fragment_beat_box);
  }
}
