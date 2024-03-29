package com.bignerdranch.android.beatbox.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bignerdranch.android.beatbox.SoundViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemSoundBinding extends ViewDataBinding {
  @Bindable
  protected SoundViewModel mViewModel;

  protected ListItemSoundBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable SoundViewModel viewModel);

  @Nullable
  public SoundViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ListItemSoundBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_sound, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemSoundBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemSoundBinding>inflateInternal(inflater, com.bignerdranch.android.beatbox.R.layout.list_item_sound, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemSoundBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_sound, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemSoundBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemSoundBinding>inflateInternal(inflater, com.bignerdranch.android.beatbox.R.layout.list_item_sound, null, false, component);
  }

  public static ListItemSoundBinding bind(@NonNull View view) {
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
  public static ListItemSoundBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemSoundBinding)bind(component, view, com.bignerdranch.android.beatbox.R.layout.list_item_sound);
  }
}
