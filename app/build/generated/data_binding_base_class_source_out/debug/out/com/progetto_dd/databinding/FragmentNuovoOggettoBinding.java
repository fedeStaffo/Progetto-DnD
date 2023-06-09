// Generated by view binder compiler. Do not edit!
package com.progetto_dd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.progetto_dd.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNuovoOggettoBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnAggiungiOggetto;

  @NonNull
  public final TextInputEditText nomeOggetto;

  @NonNull
  public final Spinner spinnerGiocatore;

  @NonNull
  public final TextView textView;

  private FragmentNuovoOggettoBinding(@NonNull LinearLayout rootView,
      @NonNull Button btnAggiungiOggetto, @NonNull TextInputEditText nomeOggetto,
      @NonNull Spinner spinnerGiocatore, @NonNull TextView textView) {
    this.rootView = rootView;
    this.btnAggiungiOggetto = btnAggiungiOggetto;
    this.nomeOggetto = nomeOggetto;
    this.spinnerGiocatore = spinnerGiocatore;
    this.textView = textView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNuovoOggettoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNuovoOggettoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_nuovo_oggetto, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNuovoOggettoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAggiungiOggetto;
      Button btnAggiungiOggetto = ViewBindings.findChildViewById(rootView, id);
      if (btnAggiungiOggetto == null) {
        break missingId;
      }

      id = R.id.nome_oggetto;
      TextInputEditText nomeOggetto = ViewBindings.findChildViewById(rootView, id);
      if (nomeOggetto == null) {
        break missingId;
      }

      id = R.id.spinnerGiocatore;
      Spinner spinnerGiocatore = ViewBindings.findChildViewById(rootView, id);
      if (spinnerGiocatore == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new FragmentNuovoOggettoBinding((LinearLayout) rootView, btnAggiungiOggetto,
          nomeOggetto, spinnerGiocatore, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
