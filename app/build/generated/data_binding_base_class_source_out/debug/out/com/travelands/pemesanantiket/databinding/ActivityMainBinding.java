// Generated by view binder compiler. Do not edit!
package com.travelands.pemesanantiket.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.navigation.NavigationView;
import com.travelands.pemesanantiket.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final Toolbar barnav;

  @NonNull
  public final CardView cvKapal;

  @NonNull
  public final CardView cvKereta;

  @NonNull
  public final CardView cvPesawat;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final ImageView iklan;

  @NonNull
  public final ImageView imageProfile;

  @NonNull
  public final NavigationView navView;

  private ActivityMainBinding(@NonNull DrawerLayout rootView, @NonNull Toolbar barnav,
      @NonNull CardView cvKapal, @NonNull CardView cvKereta, @NonNull CardView cvPesawat,
      @NonNull DrawerLayout drawerLayout, @NonNull ImageView iklan, @NonNull ImageView imageProfile,
      @NonNull NavigationView navView) {
    this.rootView = rootView;
    this.barnav = barnav;
    this.cvKapal = cvKapal;
    this.cvKereta = cvKereta;
    this.cvPesawat = cvPesawat;
    this.drawerLayout = drawerLayout;
    this.iklan = iklan;
    this.imageProfile = imageProfile;
    this.navView = navView;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.barnav;
      Toolbar barnav = ViewBindings.findChildViewById(rootView, id);
      if (barnav == null) {
        break missingId;
      }

      id = R.id.cvKapal;
      CardView cvKapal = ViewBindings.findChildViewById(rootView, id);
      if (cvKapal == null) {
        break missingId;
      }

      id = R.id.cvKereta;
      CardView cvKereta = ViewBindings.findChildViewById(rootView, id);
      if (cvKereta == null) {
        break missingId;
      }

      id = R.id.cvPesawat;
      CardView cvPesawat = ViewBindings.findChildViewById(rootView, id);
      if (cvPesawat == null) {
        break missingId;
      }

      DrawerLayout drawerLayout = (DrawerLayout) rootView;

      id = R.id.iklan;
      ImageView iklan = ViewBindings.findChildViewById(rootView, id);
      if (iklan == null) {
        break missingId;
      }

      id = R.id.imageProfile;
      ImageView imageProfile = ViewBindings.findChildViewById(rootView, id);
      if (imageProfile == null) {
        break missingId;
      }

      id = R.id.navView;
      NavigationView navView = ViewBindings.findChildViewById(rootView, id);
      if (navView == null) {
        break missingId;
      }

      return new ActivityMainBinding((DrawerLayout) rootView, barnav, cvKapal, cvKereta, cvPesawat,
          drawerLayout, iklan, imageProfile, navView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}