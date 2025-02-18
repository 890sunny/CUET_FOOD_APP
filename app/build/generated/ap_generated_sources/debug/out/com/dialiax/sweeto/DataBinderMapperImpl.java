package com.dialiax.sweeto;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.dialiax.sweeto.databinding.ActivityChooseLocationBindingImpl;
import com.dialiax.sweeto.databinding.ActivityDetailsBindingImpl;
import com.dialiax.sweeto.databinding.ActivityLoginBindingImpl;
import com.dialiax.sweeto.databinding.ActivityMainBindingImpl;
import com.dialiax.sweeto.databinding.ActivityPayOutBindingImpl;
import com.dialiax.sweeto.databinding.ActivitySignBindingImpl;
import com.dialiax.sweeto.databinding.ActivityStartBindingImpl;
import com.dialiax.sweeto.databinding.BuyAgainItemBindingImpl;
import com.dialiax.sweeto.databinding.CartItemBindingImpl;
import com.dialiax.sweeto.databinding.FragmentCartBindingImpl;
import com.dialiax.sweeto.databinding.FragmentCongratsBottomSheetBindingImpl;
import com.dialiax.sweeto.databinding.FragmentHistoryBindingImpl;
import com.dialiax.sweeto.databinding.FragmentHomeBindingImpl;
import com.dialiax.sweeto.databinding.FragmentMenuBottomSheetBindingImpl;
import com.dialiax.sweeto.databinding.FragmentNotificationBottomBindingImpl;
import com.dialiax.sweeto.databinding.FragmentSearchBindingImpl;
import com.dialiax.sweeto.databinding.MenuItemBindingImpl;
import com.dialiax.sweeto.databinding.NotificationItemBindingImpl;
import com.dialiax.sweeto.databinding.PopularItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCHOOSELOCATION = 1;

  private static final int LAYOUT_ACTIVITYDETAILS = 2;

  private static final int LAYOUT_ACTIVITYLOGIN = 3;

  private static final int LAYOUT_ACTIVITYMAIN = 4;

  private static final int LAYOUT_ACTIVITYPAYOUT = 5;

  private static final int LAYOUT_ACTIVITYSIGN = 6;

  private static final int LAYOUT_ACTIVITYSTART = 7;

  private static final int LAYOUT_BUYAGAINITEM = 8;

  private static final int LAYOUT_CARTITEM = 9;

  private static final int LAYOUT_FRAGMENTCART = 10;

  private static final int LAYOUT_FRAGMENTCONGRATSBOTTOMSHEET = 11;

  private static final int LAYOUT_FRAGMENTHISTORY = 12;

  private static final int LAYOUT_FRAGMENTHOME = 13;

  private static final int LAYOUT_FRAGMENTMENUBOTTOMSHEET = 14;

  private static final int LAYOUT_FRAGMENTNOTIFICATIONBOTTOM = 15;

  private static final int LAYOUT_FRAGMENTSEARCH = 16;

  private static final int LAYOUT_MENUITEM = 17;

  private static final int LAYOUT_NOTIFICATIONITEM = 18;

  private static final int LAYOUT_POPULARITEM = 19;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(19);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.activity_choose_location, LAYOUT_ACTIVITYCHOOSELOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.activity_details, LAYOUT_ACTIVITYDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.activity_pay_out, LAYOUT_ACTIVITYPAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.activity_sign, LAYOUT_ACTIVITYSIGN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.activity_start, LAYOUT_ACTIVITYSTART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.buy_again_item, LAYOUT_BUYAGAINITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.cart_item, LAYOUT_CARTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.fragment_cart, LAYOUT_FRAGMENTCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.fragment_congrats_bottom_sheet, LAYOUT_FRAGMENTCONGRATSBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.fragment_history, LAYOUT_FRAGMENTHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.fragment_menu_bottom_sheet, LAYOUT_FRAGMENTMENUBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.fragment_notification_bottom, LAYOUT_FRAGMENTNOTIFICATIONBOTTOM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.menu_item, LAYOUT_MENUITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.notification_item, LAYOUT_NOTIFICATIONITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dialiax.sweeto.R.layout.popular_item, LAYOUT_POPULARITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCHOOSELOCATION: {
          if ("layout/activity_choose_location_0".equals(tag)) {
            return new ActivityChooseLocationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_choose_location is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDETAILS: {
          if ("layout/activity_details_0".equals(tag)) {
            return new ActivityDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPAYOUT: {
          if ("layout/activity_pay_out_0".equals(tag)) {
            return new ActivityPayOutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_pay_out is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSIGN: {
          if ("layout/activity_sign_0".equals(tag)) {
            return new ActivitySignBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sign is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSTART: {
          if ("layout/activity_start_0".equals(tag)) {
            return new ActivityStartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_start is invalid. Received: " + tag);
        }
        case  LAYOUT_BUYAGAINITEM: {
          if ("layout/buy_again_item_0".equals(tag)) {
            return new BuyAgainItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for buy_again_item is invalid. Received: " + tag);
        }
        case  LAYOUT_CARTITEM: {
          if ("layout/cart_item_0".equals(tag)) {
            return new CartItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for cart_item is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCART: {
          if ("layout/fragment_cart_0".equals(tag)) {
            return new FragmentCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONGRATSBOTTOMSHEET: {
          if ("layout/fragment_congrats_bottom_sheet_0".equals(tag)) {
            return new FragmentCongratsBottomSheetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_congrats_bottom_sheet is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHISTORY: {
          if ("layout/fragment_history_0".equals(tag)) {
            return new FragmentHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_history is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMENUBOTTOMSHEET: {
          if ("layout/fragment_menu_bottom_sheet_0".equals(tag)) {
            return new FragmentMenuBottomSheetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_menu_bottom_sheet is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNOTIFICATIONBOTTOM: {
          if ("layout/fragment_notification_bottom_0".equals(tag)) {
            return new FragmentNotificationBottomBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_notification_bottom is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_MENUITEM: {
          if ("layout/menu_item_0".equals(tag)) {
            return new MenuItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for menu_item is invalid. Received: " + tag);
        }
        case  LAYOUT_NOTIFICATIONITEM: {
          if ("layout/notification_item_0".equals(tag)) {
            return new NotificationItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for notification_item is invalid. Received: " + tag);
        }
        case  LAYOUT_POPULARITEM: {
          if ("layout/popular_item_0".equals(tag)) {
            return new PopularItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for popular_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(19);

    static {
      sKeys.put("layout/activity_choose_location_0", com.dialiax.sweeto.R.layout.activity_choose_location);
      sKeys.put("layout/activity_details_0", com.dialiax.sweeto.R.layout.activity_details);
      sKeys.put("layout/activity_login_0", com.dialiax.sweeto.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", com.dialiax.sweeto.R.layout.activity_main);
      sKeys.put("layout/activity_pay_out_0", com.dialiax.sweeto.R.layout.activity_pay_out);
      sKeys.put("layout/activity_sign_0", com.dialiax.sweeto.R.layout.activity_sign);
      sKeys.put("layout/activity_start_0", com.dialiax.sweeto.R.layout.activity_start);
      sKeys.put("layout/buy_again_item_0", com.dialiax.sweeto.R.layout.buy_again_item);
      sKeys.put("layout/cart_item_0", com.dialiax.sweeto.R.layout.cart_item);
      sKeys.put("layout/fragment_cart_0", com.dialiax.sweeto.R.layout.fragment_cart);
      sKeys.put("layout/fragment_congrats_bottom_sheet_0", com.dialiax.sweeto.R.layout.fragment_congrats_bottom_sheet);
      sKeys.put("layout/fragment_history_0", com.dialiax.sweeto.R.layout.fragment_history);
      sKeys.put("layout/fragment_home_0", com.dialiax.sweeto.R.layout.fragment_home);
      sKeys.put("layout/fragment_menu_bottom_sheet_0", com.dialiax.sweeto.R.layout.fragment_menu_bottom_sheet);
      sKeys.put("layout/fragment_notification_bottom_0", com.dialiax.sweeto.R.layout.fragment_notification_bottom);
      sKeys.put("layout/fragment_search_0", com.dialiax.sweeto.R.layout.fragment_search);
      sKeys.put("layout/menu_item_0", com.dialiax.sweeto.R.layout.menu_item);
      sKeys.put("layout/notification_item_0", com.dialiax.sweeto.R.layout.notification_item);
      sKeys.put("layout/popular_item_0", com.dialiax.sweeto.R.layout.popular_item);
    }
  }
}
