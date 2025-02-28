// Generated by data binding compiler. Do not edit!
package com.dialiax.sweeto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dialiax.sweeto.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentNotificationBottomBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView notificationRecyclerView;

  @NonNull
  public final TextView textView12;

  protected FragmentNotificationBottomBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RecyclerView notificationRecyclerView, TextView textView12) {
    super(_bindingComponent, _root, _localFieldCount);
    this.notificationRecyclerView = notificationRecyclerView;
    this.textView12 = textView12;
  }

  @NonNull
  public static FragmentNotificationBottomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_notification_bottom, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNotificationBottomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentNotificationBottomBinding>inflateInternal(inflater, R.layout.fragment_notification_bottom, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentNotificationBottomBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_notification_bottom, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNotificationBottomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentNotificationBottomBinding>inflateInternal(inflater, R.layout.fragment_notification_bottom, null, false, component);
  }

  public static FragmentNotificationBottomBinding bind(@NonNull View view) {
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
  public static FragmentNotificationBottomBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentNotificationBottomBinding)bind(component, view, R.layout.fragment_notification_bottom);
  }
}
