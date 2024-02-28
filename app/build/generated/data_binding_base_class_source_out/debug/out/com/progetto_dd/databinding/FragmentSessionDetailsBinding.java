// Generated by view binder compiler. Do not edit!
package com.progetto_dd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

  @NonNull
  public final Button modificaDescrizioneButton;

  @NonNull
  public final EditText modificaDescrizioneEdittext;

  @NonNull
  public final Button modificaGiornoButton;

  @NonNull
  public final EditText modificaGiornoEdittext;

  @NonNull
  public final Button salvaDescrizioneButton;

  @NonNull
  public final Button salvaGiornoButton;

  private FragmentSessionDetailsBinding(@NonNull ScrollView rootView, @NonNull TextView Descrizione,
      @NonNull TextView Giorno, @NonNull TextView Numero, @NonNull Button eliminaSessione,
      @NonNull Button modificaDescrizioneButton, @NonNull EditText modificaDescrizioneEdittext,
      @NonNull Button modificaGiornoButton, @NonNull EditText modificaGiornoEdittext,
      @NonNull Button salvaDescrizioneButton, @NonNull Button salvaGiornoButton) {
    this.rootView = rootView;
    this.Descrizione = Descrizione;
    this.Giorno = Giorno;
    this.Numero = Numero;
    this.eliminaSessione = eliminaSessione;
    this.modificaDescrizioneButton = modificaDescrizioneButton;
    this.modificaDescrizioneEdittext = modificaDescrizioneEdittext;
    this.modificaGiornoButton = modificaGiornoButton;
    this.modificaGiornoEdittext = modificaGiornoEdittext;
    this.salvaDescrizioneButton = salvaDescrizioneButton;
    this.salvaGiornoButton = salvaGiornoButton;
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

      id = R.id.modifica_descrizione_button;
      Button modificaDescrizioneButton = ViewBindings.findChildViewById(rootView, id);
      if (modificaDescrizioneButton == null) {
        break missingId;
      }

      id = R.id.modifica_descrizione_edittext;
      EditText modificaDescrizioneEdittext = ViewBindings.findChildViewById(rootView, id);
      if (modificaDescrizioneEdittext == null) {
        break missingId;
      }

      id = R.id.modifica_giorno_button;
      Button modificaGiornoButton = ViewBindings.findChildViewById(rootView, id);
      if (modificaGiornoButton == null) {
        break missingId;
      }

      id = R.id.modifica_giorno_edittext;
      EditText modificaGiornoEdittext = ViewBindings.findChildViewById(rootView, id);
      if (modificaGiornoEdittext == null) {
        break missingId;
      }

      id = R.id.salva_descrizione_button;
      Button salvaDescrizioneButton = ViewBindings.findChildViewById(rootView, id);
      if (salvaDescrizioneButton == null) {
        break missingId;
      }

      id = R.id.salva_giorno_button;
      Button salvaGiornoButton = ViewBindings.findChildViewById(rootView, id);
      if (salvaGiornoButton == null) {
        break missingId;
      }

      return new FragmentSessionDetailsBinding((ScrollView) rootView, Descrizione, Giorno, Numero,
          eliminaSessione, modificaDescrizioneButton, modificaDescrizioneEdittext,
          modificaGiornoButton, modificaGiornoEdittext, salvaDescrizioneButton, salvaGiornoButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
