// Generated by data binding compiler. Do not edit!
package com.dialiax.sweeto.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dialiax.sweeto.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSearchBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView menuRecyclerView2;

  @NonNull
  public final SearchView searchView;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView8;

  protected FragmentSearchBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView menuRecyclerView2, SearchView searchView, TextView textView10,
      TextView textView8) {
    super(_bindingComponent, _root, _localFieldCount);
    this.menuRecyclerView2 = menuRecyclerView2;
    this.searchView = searchView;
    this.textView10 = textView10;
    this.textView8 = textView8;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_search, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSearchBinding>inflateInternal(inflater, R.layout.fragment_search, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_search, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSearchBinding>inflateInternal(inflater, R.layout.fragment_search, null, false, component);
  }

  public static FragmentSearchBinding bind(@NonNull View view) {
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
  public static FragmentSearchBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSearchBinding)bind(component, view, R.layout.fragment_search);
  }
}
