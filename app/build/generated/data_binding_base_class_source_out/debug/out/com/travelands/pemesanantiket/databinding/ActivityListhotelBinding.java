// Generated by view binder compiler. Do not edit!
package com.travelands.pemesanantiket.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.travelands.pemesanantiket.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityListhotelBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CardView bali;

  @NonNull
  public final CardView bandung;

  @NonNull
  public final ImageView btntoiklan;

  @NonNull
  public final ImageView listbali;

  @NonNull
  public final ImageView listbandung;

  @NonNull
  public final ImageView listjakarta;

  @NonNull
  public final ImageView listsurabaya;

  @NonNull
  public final CardView listt;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final CardView surabaya;

  private ActivityListhotelBinding(@NonNull CoordinatorLayout rootView, @NonNull CardView bali,
      @NonNull CardView bandung, @NonNull ImageView btntoiklan, @NonNull ImageView listbali,
      @NonNull ImageView listbandung, @NonNull ImageView listjakarta,
      @NonNull ImageView listsurabaya, @NonNull CardView listt,
      @NonNull NestedScrollView nestedScrollView, @NonNull CardView surabaya) {
    this.rootView = rootView;
    this.bali = bali;
    this.bandung = bandung;
    this.btntoiklan = btntoiklan;
    this.listbali = listbali;
    this.listbandung = listbandung;
    this.listjakarta = listjakarta;
    this.listsurabaya = listsurabaya;
    this.listt = listt;
    this.nestedScrollView = nestedScrollView;
    this.surabaya = surabaya;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityListhotelBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityListhotelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_listhotel, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityListhotelBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bali;
      CardView bali = ViewBindings.findChildViewById(rootView, id);
      if (bali == null) {
        break missingId;
      }

      id = R.id.bandung;
      CardView bandung = ViewBindings.findChildViewById(rootView, id);
      if (bandung == null) {
        break missingId;
      }

      id = R.id.btntoiklan;
      ImageView btntoiklan = ViewBindings.findChildViewById(rootView, id);
      if (btntoiklan == null) {
        break missingId;
      }

      id = R.id.listbali;
      ImageView listbali = ViewBindings.findChildViewById(rootView, id);
      if (listbali == null) {
        break missingId;
      }

      id = R.id.listbandung;
      ImageView listbandung = ViewBindings.findChildViewById(rootView, id);
      if (listbandung == null) {
        break missingId;
      }

      id = R.id.listjakarta;
      ImageView listjakarta = ViewBindings.findChildViewById(rootView, id);
      if (listjakarta == null) {
        break missingId;
      }

      id = R.id.listsurabaya;
      ImageView listsurabaya = ViewBindings.findChildViewById(rootView, id);
      if (listsurabaya == null) {
        break missingId;
      }

      id = R.id.listt;
      CardView listt = ViewBindings.findChildViewById(rootView, id);
      if (listt == null) {
        break missingId;
      }

      id = R.id.nestedScrollView;
      NestedScrollView nestedScrollView = ViewBindings.findChildViewById(rootView, id);
      if (nestedScrollView == null) {
        break missingId;
      }

      id = R.id.surabaya;
      CardView surabaya = ViewBindings.findChildViewById(rootView, id);
      if (surabaya == null) {
        break missingId;
      }

      return new ActivityListhotelBinding((CoordinatorLayout) rootView, bali, bandung, btntoiklan,
          listbali, listbandung, listjakarta, listsurabaya, listt, nestedScrollView, surabaya);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
