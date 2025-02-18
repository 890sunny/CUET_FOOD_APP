// Generated by data binding compiler. Do not edit!
package com.dialiax.sweeto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.dialiax.sweeto.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class NotificationItemBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardView3;

  @NonNull
  public final ImageView notificationimageView;

  @NonNull
  public final TextView notificationtextView;

  protected NotificationItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardView3, ImageView notificationimageView, TextView notificationtextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView3 = cardView3;
    this.notificationimageView = notificationimageView;
    this.notificationtextView = notificationtextView;
  }

  @NonNull
  public static NotificationItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.notification_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NotificationItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NotificationItemBinding>inflateInternal(inflater, R.layout.notification_item, root, attachToRoot, component);
  }

  @NonNull
  public static NotificationItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.notification_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NotificationItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NotificationItemBinding>inflateInternal(inflater, R.layout.notification_item, null, false, component);
  }

  public static NotificationItemBinding bind(@NonNull View view) {
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
  public static NotificationItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (NotificationItemBinding)bind(component, view, R.layout.notification_item);
  }
}
