// Generated by view binder compiler. Do not edit!
package com.progetto_dd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.progetto_dd.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRaceBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnAvanti;

  @NonNull
  public final Button btnIndietro;

  @NonNull
  public final Button infoElfo;

  @NonNull
  public final Button infoNano;

  @NonNull
  public final Button infoUmano;

  @NonNull
  public final Button scegliElfo;

  @NonNull
  public final Button scegliNano;

  @NonNull
  public final Button scegliUmano;

  private FragmentRaceBinding(@NonNull LinearLayout rootView, @NonNull Button btnAvanti,
      @NonNull Button btnIndietro, @NonNull Button infoElfo, @NonNull Button infoNano,
      @NonNull Button infoUmano, @NonNull Button scegliElfo, @NonNull Button scegliNano,
      @NonNull Button scegliUmano) {
    this.rootView = rootView;
    this.btnAvanti = btnAvanti;
    this.btnIndietro = btnIndietro;
    this.infoElfo = infoElfo;
    this.infoNano = infoNano;
    this.infoUmano = infoUmano;
    this.scegliElfo = scegliElfo;
    this.scegliNano = scegliNano;
    this.scegliUmano = scegliUmano;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRaceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRaceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_race, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRaceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_avanti;
      Button btnAvanti = ViewBindings.findChildViewById(rootView, id);
      if (btnAvanti == null) {
        break missingId;
      }

      id = R.id.btn_indietro;
      Button btnIndietro = ViewBindings.findChildViewById(rootView, id);
      if (btnIndietro == null) {
        break missingId;
      }

      id = R.id.info_elfo;
      Button infoElfo = ViewBindings.findChildViewById(rootView, id);
      if (infoElfo == null) {
        break missingId;
      }

      id = R.id.info_nano;
      Button infoNano = ViewBindings.findChildViewById(rootView, id);
      if (infoNano == null) {
        break missingId;
      }

      id = R.id.info_umano;
      Button infoUmano = ViewBindings.findChildViewById(rootView, id);
      if (infoUmano == null) {
        break missingId;
      }

      id = R.id.scegli_elfo;
      Button scegliElfo = ViewBindings.findChildViewById(rootView, id);
      if (scegliElfo == null) {
        break missingId;
      }

      id = R.id.scegli_nano;
      Button scegliNano = ViewBindings.findChildViewById(rootView, id);
      if (scegliNano == null) {
        break missingId;
      }

      id = R.id.scegli_umano;
      Button scegliUmano = ViewBindings.findChildViewById(rootView, id);
      if (scegliUmano == null) {
        break missingId;
      }

      return new FragmentRaceBinding((LinearLayout) rootView, btnAvanti, btnIndietro, infoElfo,
          infoNano, infoUmano, scegliElfo, scegliNano, scegliUmano);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
