package com.progetto_dd.memory.personaggio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0004\n\u0002\b\u0006\u0018\u0000 \u0084\u00012\u00020\u0001:\u0002\u0084\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u0005J.\u0010L\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u0005J\u001e\u0010N\u001a\u00020F2\u0006\u0010?\u001a\u00020\u00052\u0006\u0010O\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u0005J4\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u001a2\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00052\u0006\u0010R\u001a\u00020\u0005J\"\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\u001a2\u0006\u0010?\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u0005J\u0012\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\u000e0\u001aJ4\u0010V\u001a\b\u0012\u0004\u0012\u00020Q0\u001a2\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u0005J4\u0010X\u001a\b\u0012\u0004\u0012\u00020Q0\u001a2\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u0005J\u0006\u0010Z\u001a\u00020FJ\u000e\u0010[\u001a\u00020F2\u0006\u0010\\\u001a\u00020\u0005J\u000e\u0010]\u001a\u00020F2\u0006\u0010^\u001a\u00020\u0005J\u000e\u0010_\u001a\u00020F2\u0006\u0010`\u001a\u00020\u0005J\u000e\u0010a\u001a\u00020F2\u0006\u0010b\u001a\u00020\u0005J\u000e\u0010c\u001a\u00020F2\u0006\u0010d\u001a\u00020\u0005J\u000e\u0010e\u001a\u00020F2\u0006\u0010f\u001a\u00020\u0005J\u000e\u0010g\u001a\u00020F2\u0006\u0010h\u001a\u00020\u0005J\u000e\u0010i\u001a\u00020F2\u0006\u0010I\u001a\u00020\u0005J\u0014\u0010j\u001a\u00020F2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eJ\u0018\u0010l\u001a\u00020F2\u0010\u0010m\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000eJ\u000e\u0010n\u001a\u00020F2\u0006\u0010o\u001a\u00020\u0011J\u000e\u0010p\u001a\u00020F2\u0006\u0010q\u001a\u00020\u0011J\u000e\u0010r\u001a\u00020F2\u0006\u0010s\u001a\u00020\u0011J\u000e\u0010t\u001a\u00020F2\u0006\u0010u\u001a\u00020\u0011J\u000e\u0010v\u001a\u00020F2\u0006\u0010w\u001a\u00020\u0011J\u000e\u0010x\u001a\u00020F2\u0006\u0010y\u001a\u00020\u0011J\u000e\u0010z\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0005J\u000e\u0010{\u001a\u00020F2\u0006\u0010H\u001a\u00020\u0005J6\u0010|\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00052\u0006\u0010}\u001a\u00020\u00052\u0006\u0010~\u001a\u00020\u007fJ8\u0010\u0080\u0001\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00052\u0007\u0010\u0081\u0001\u001a\u00020\u00052\u0006\u0010~\u001a\u00020\u0005J \u0010\u0082\u0001\u001a\u00020F2\u0006\u0010?\u001a\u00020\u00052\u0006\u0010O\u001a\u00020\u00052\u0007\u0010\u0083\u0001\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000e0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u001cR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u001cR\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u001cR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8F\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u001cR\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000e0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b2\u0010\u001cR\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8F\u00a2\u0006\u0006\u001a\u0004\b4\u0010\u001cR\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8F\u00a2\u0006\u0006\u001a\u0004\b6\u0010\u001cR\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8F\u00a2\u0006\u0006\u001a\u0004\b8\u0010\u001cR\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8F\u00a2\u0006\u0006\u001a\u0004\b:\u0010\u001cR\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8F\u00a2\u0006\u0006\u001a\u0004\b<\u0010\u001cR\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8F\u00a2\u0006\u0006\u001a\u0004\b>\u0010\u001cR\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8F\u00a2\u0006\u0006\u001a\u0004\b@\u0010\u001cR\u000e\u0010A\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8F\u00a2\u0006\u0006\u001a\u0004\bC\u0010\u001cR\u000e\u0010D\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0085\u0001"}, d2 = {"Lcom/progetto_dd/memory/personaggio/PersonaggioViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_backgroundAllineamento", "Landroidx/lifecycle/MutableLiveData;", "", "_backgroundDescrizione", "_backgroundDifetti", "_backgroundIdeali", "_backgroundLegami", "_backgroundStoria", "_backgroundTratti", "_classePersonaggio", "_competenzePersonaggio", "", "_equipaggiamento", "_modCarisma", "", "_modCostituzione", "_modDestrezza", "_modForza", "_modIntelligenza", "_modSaggezza", "_nomePersonaggio", "_razzaPersonaggio", "backgroundAllineamento", "Landroidx/lifecycle/LiveData;", "getBackgroundAllineamento", "()Landroidx/lifecycle/LiveData;", "backgroundDescrizione", "getBackgroundDescrizione", "backgroundDifetti", "getBackgroundDifetti", "backgroundIdeali", "getBackgroundIdeali", "backgroundLegami", "getBackgroundLegami", "backgroundStoria", "getBackgroundStoria", "backgroundTratti", "getBackgroundTratti", "classePersonaggio", "getClassePersonaggio", "classiRef", "Lcom/google/firebase/firestore/CollectionReference;", "competenzePersonaggio", "getCompetenzePersonaggio", "currentUser", "Lcom/google/firebase/auth/FirebaseUser;", "equipaggiamento", "getEquipaggiamento", "modCarisma", "getModCarisma", "modCostituzione", "getModCostituzione", "modDestrezza", "getModDestrezza", "modForza", "getModForza", "modIntelligenza", "getModIntelligenza", "modSaggezza", "getModSaggezza", "nomePersonaggio", "getNomePersonaggio", "personaggiRef", "razzaPersonaggio", "getRazzaPersonaggio", "razzeRef", "addEquipaggiamentoToPersonaggio", "", "nome", "razza", "classe", "utenteId", "nuovoOggetto", "addIncantesimoToPersonaggio", "nuovaMagia", "aggiungiEquipaggiamento", "nomeCampagna", "deletePersonaggio", "", "campagna", "getMagieFromFirestore", "getPersonaggi", "Lcom/progetto_dd/memory/personaggio/Personaggio;", "removeEquipaggiamentoFromPersonaggio", "oggettoDaRimuovere", "removeIncantesimoFromPersonaggio", "magiaDaRimuovere", "saveCharacterToFirestore", "setBackgroundAllineamento", "allineamento", "setBackgroundDescrizione", "descrizione", "setBackgroundDifetti", "difetti", "setBackgroundIdeali", "ideali", "setBackgroundLegami", "legami", "setBackgroundStoria", "storia", "setBackgroundTratti", "tratti", "setClassePersonaggio", "setCompetenzePersonaggio", "competenze", "setEquipaggiamento", "equipaggiamentoList", "setModCarisma", "carisma", "setModCostituzione", "costituzione", "setModDestrezza", "destrezza", "setModForza", "forza", "setModIntelligenza", "intelligenza", "setModSaggezza", "saggezza", "setNomePersonaggio", "setRazzaPersonaggio", "updateCampoNumerico", "nomeCampo", "nuovoValore", "", "updateCampoString", "campo", "updatePersonaggioStato", "nuovoStato", "Companion", "app_debug"})
public final class PersonaggioViewModel extends androidx.lifecycle.ViewModel {
    private final com.google.firebase.firestore.CollectionReference personaggiRef = null;
    private final com.google.firebase.firestore.CollectionReference razzeRef = null;
    private final com.google.firebase.firestore.CollectionReference classiRef = null;
    private final com.google.firebase.auth.FirebaseUser currentUser = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _nomePersonaggio = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _razzaPersonaggio = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _classePersonaggio = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> _competenzePersonaggio = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _backgroundDescrizione = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _backgroundStoria = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _backgroundTratti = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _backgroundDifetti = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _backgroundIdeali = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _backgroundLegami = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _backgroundAllineamento = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _modForza = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _modDestrezza = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _modCostituzione = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _modIntelligenza = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _modSaggezza = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _modCarisma = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> _equipaggiamento = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.progetto_dd.memory.personaggio.PersonaggioViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "com.progetto_dd.view.characters.HomeCharacterFragment";
    
    public PersonaggioViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getNomePersonaggio() {
        return null;
    }
    
    public final void setNomePersonaggio(@org.jetbrains.annotations.NotNull()
    java.lang.String nome) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getRazzaPersonaggio() {
        return null;
    }
    
    public final void setRazzaPersonaggio(@org.jetbrains.annotations.NotNull()
    java.lang.String razza) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getClassePersonaggio() {
        return null;
    }
    
    public final void setClassePersonaggio(@org.jetbrains.annotations.NotNull()
    java.lang.String classe) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getCompetenzePersonaggio() {
        return null;
    }
    
    public final void setCompetenzePersonaggio(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> competenze) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getBackgroundDescrizione() {
        return null;
    }
    
    public final void setBackgroundDescrizione(@org.jetbrains.annotations.NotNull()
    java.lang.String descrizione) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getBackgroundStoria() {
        return null;
    }
    
    public final void setBackgroundStoria(@org.jetbrains.annotations.NotNull()
    java.lang.String storia) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getBackgroundTratti() {
        return null;
    }
    
    public final void setBackgroundTratti(@org.jetbrains.annotations.NotNull()
    java.lang.String tratti) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getBackgroundDifetti() {
        return null;
    }
    
    public final void setBackgroundDifetti(@org.jetbrains.annotations.NotNull()
    java.lang.String difetti) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getBackgroundIdeali() {
        return null;
    }
    
    public final void setBackgroundIdeali(@org.jetbrains.annotations.NotNull()
    java.lang.String ideali) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getBackgroundLegami() {
        return null;
    }
    
    public final void setBackgroundLegami(@org.jetbrains.annotations.NotNull()
    java.lang.String legami) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getBackgroundAllineamento() {
        return null;
    }
    
    public final void setBackgroundAllineamento(@org.jetbrains.annotations.NotNull()
    java.lang.String allineamento) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getModForza() {
        return null;
    }
    
    public final void setModForza(int forza) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getModDestrezza() {
        return null;
    }
    
    public final void setModDestrezza(int destrezza) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getModCostituzione() {
        return null;
    }
    
    public final void setModCostituzione(int costituzione) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getModIntelligenza() {
        return null;
    }
    
    public final void setModIntelligenza(int intelligenza) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getModSaggezza() {
        return null;
    }
    
    public final void setModSaggezza(int saggezza) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getModCarisma() {
        return null;
    }
    
    public final void setModCarisma(int carisma) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getEquipaggiamento() {
        return null;
    }
    
    public final void setEquipaggiamento(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> equipaggiamentoList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.progetto_dd.memory.personaggio.Personaggio>> getPersonaggi() {
        return null;
    }
    
    public final void saveCharacterToFirestore() {
    }
    
    public final void aggiungiEquipaggiamento(@org.jetbrains.annotations.NotNull()
    java.lang.String nomePersonaggio, @org.jetbrains.annotations.NotNull()
    java.lang.String nomeCampagna, @org.jetbrains.annotations.NotNull()
    java.lang.String nuovoOggetto) {
    }
    
    public final void updatePersonaggioStato(@org.jetbrains.annotations.NotNull()
    java.lang.String nomePersonaggio, @org.jetbrains.annotations.NotNull()
    java.lang.String nomeCampagna, @org.jetbrains.annotations.NotNull()
    java.lang.String nuovoStato) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> deletePersonaggio(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String razza, @org.jetbrains.annotations.NotNull()
    java.lang.String classe, @org.jetbrains.annotations.NotNull()
    java.lang.String utenteId, @org.jetbrains.annotations.NotNull()
    java.lang.String campagna) {
        return null;
    }
    
    public final void updateCampoNumerico(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String razza, @org.jetbrains.annotations.NotNull()
    java.lang.String classe, @org.jetbrains.annotations.NotNull()
    java.lang.String utenteId, @org.jetbrains.annotations.NotNull()
    java.lang.String nomeCampo, @org.jetbrains.annotations.NotNull()
    java.lang.Number nuovoValore) {
    }
    
    public final void updateCampoString(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String razza, @org.jetbrains.annotations.NotNull()
    java.lang.String classe, @org.jetbrains.annotations.NotNull()
    java.lang.String utenteId, @org.jetbrains.annotations.NotNull()
    java.lang.String campo, @org.jetbrains.annotations.NotNull()
    java.lang.String nuovoValore) {
    }
    
    public final void addEquipaggiamentoToPersonaggio(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String razza, @org.jetbrains.annotations.NotNull()
    java.lang.String classe, @org.jetbrains.annotations.NotNull()
    java.lang.String utenteId, @org.jetbrains.annotations.NotNull()
    java.lang.String nuovoOggetto) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> removeEquipaggiamentoFromPersonaggio(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String razza, @org.jetbrains.annotations.NotNull()
    java.lang.String classe, @org.jetbrains.annotations.NotNull()
    java.lang.String utenteId, @org.jetbrains.annotations.NotNull()
    java.lang.String oggettoDaRimuovere) {
        return null;
    }
    
    public final void addIncantesimoToPersonaggio(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String razza, @org.jetbrains.annotations.NotNull()
    java.lang.String classe, @org.jetbrains.annotations.NotNull()
    java.lang.String utenteId, @org.jetbrains.annotations.NotNull()
    java.lang.String nuovaMagia) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> removeIncantesimoFromPersonaggio(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String razza, @org.jetbrains.annotations.NotNull()
    java.lang.String classe, @org.jetbrains.annotations.NotNull()
    java.lang.String utenteId, @org.jetbrains.annotations.NotNull()
    java.lang.String magiaDaRimuovere) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getMagieFromFirestore(@org.jetbrains.annotations.NotNull()
    java.lang.String nomePersonaggio, @org.jetbrains.annotations.NotNull()
    java.lang.String utenteId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/progetto_dd/memory/personaggio/PersonaggioViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}