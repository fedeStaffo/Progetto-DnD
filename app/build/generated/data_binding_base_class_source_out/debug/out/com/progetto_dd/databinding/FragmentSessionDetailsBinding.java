// Generated by view binder compiler. Do not edit!
package com.progetto_dd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.progetto_dd.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSessionDetailsBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView Descrizione;

  @NonNull
  public final TextView Giorno;

  @NonNull
  public final TextView Numero;

  @NonNull
  public final Button eliminaSessione;

  private FragmentSessionDetailsBinding(@NonNull ScrollView rootView, @NonNull TextView Descrizione,
      @NonNull TextView Giorno, @NonNull TextView Numero, @NonNull Button eliminaSessione) {
    this.rootView = rootView;
    this.Descrizione = Descrizione;
    this.Giorno = Giorno;
    this.Numero = Numero;
    this.eliminaSessione = eliminaSessione;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSessionDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSessionDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_session_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSessionDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Descrizione;
      TextView Descrizione = ViewBindings.findChildViewById(rootView, id);
      if (Descrizione == null) {
        break missingId;
      }

      id = R.id.Giorno;
      TextView Giorno = ViewBindings.findChildViewById(rootView, id);
      if (Giorno == null) {
        break missingId;
      }

      id = R.id.Numero;
      TextView Numero = ViewBindings.findChildViewById(rootView, id);
      if (Numero == null) {
        break missingId;
      }

      id = R.id.elimina_sessione;
      Button eliminaSessione = ViewBindings.findChildViewById(rootView, id);
      if (eliminaSessione == null) {
        break missingId;
      }

      return new FragmentSessionDetailsBinding((ScrollView) rootView, Descrizione, Giorno, Numero,
          eliminaSessione);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}