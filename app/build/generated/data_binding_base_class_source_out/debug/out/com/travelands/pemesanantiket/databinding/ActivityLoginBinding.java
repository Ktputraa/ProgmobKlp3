// Generated by view binder compiler. Do not edit!
package com.travelands.pemesanantiket.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.travelands.pemesanantiket.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final EditText edtEmailLogin;

  @NonNull
  public final EditText edtPasswordLogin;

  @NonNull
  public final CardView logenn;

  @NonNull
  public final TextView tvToRegister;

  private ActivityLoginBinding(@NonNull RelativeLayout rootView, @NonNull Button btnLogin,
      @NonNull EditText edtEmailLogin, @NonNull EditText edtPasswordLogin, @NonNull CardView logenn,
      @NonNull TextView tvToRegister) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.edtEmailLogin = edtEmailLogin;
    this.edtPasswordLogin = edtPasswordLogin;
    this.logenn = logenn;
    this.tvToRegister = tvToRegister;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_login;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.edt_email_login;
      EditText edtEmailLogin = ViewBindings.findChildViewById(rootView, id);
      if (edtEmailLogin == null) {
        break missingId;
      }

      id = R.id.edt_password_login;
      EditText edtPasswordLogin = ViewBindings.findChildViewById(rootView, id);
      if (edtPasswordLogin == null) {
        break missingId;
      }

      id = R.id.logenn;
      CardView logenn = ViewBindings.findChildViewById(rootView, id);
      if (logenn == null) {
        break missingId;
      }

      id = R.id.tv_to_register;
      TextView tvToRegister = ViewBindings.findChildViewById(rootView, id);
      if (tvToRegister == null) {
        break missingId;
      }

      return new ActivityLoginBinding((RelativeLayout) rootView, btnLogin, edtEmailLogin,
          edtPasswordLogin, logenn, tvToRegister);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
