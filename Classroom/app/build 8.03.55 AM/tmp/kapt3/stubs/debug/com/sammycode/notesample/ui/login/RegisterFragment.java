package com.sammycode.notesample.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0015H\u0016J\u001a\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%H\u0002J\u0014\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020%0\'H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006)"}, d2 = {"Lcom/sammycode/notesample/ui/login/RegisterFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/sammycode/notesample/databinding/FragmentRegisterBinding;", "authViewModel", "Lcom/sammycode/notesample/ui/login/AuthViewModel;", "getAuthViewModel", "()Lcom/sammycode/notesample/ui/login/AuthViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "binding", "getBinding", "()Lcom/sammycode/notesample/databinding/FragmentRegisterBinding;", "tokenManager", "Lcom/sammycode/notesample/utils/TokenManager;", "getTokenManager", "()Lcom/sammycode/notesample/utils/TokenManager;", "setTokenManager", "(Lcom/sammycode/notesample/utils/TokenManager;)V", "bindObservers", "", "getUserRequest", "Lcom/sammycode/notesample/models/UserRequest;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "showValidationErrors", "error", "", "validateUserInput", "Lkotlin/Pair;", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RegisterFragment extends androidx.fragment.app.Fragment {
    private com.sammycode.notesample.databinding.FragmentRegisterBinding _binding;
    private final kotlin.Lazy authViewModel$delegate = null;
    @javax.inject.Inject()
    public com.sammycode.notesample.utils.TokenManager tokenManager;
    
    public RegisterFragment() {
        super();
    }
    
    private final com.sammycode.notesample.databinding.FragmentRegisterBinding getBinding() {
        return null;
    }
    
    private final com.sammycode.notesample.ui.login.AuthViewModel getAuthViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sammycode.notesample.utils.TokenManager getTokenManager() {
        return null;
    }
    
    public final void setTokenManager(@org.jetbrains.annotations.NotNull()
    com.sammycode.notesample.utils.TokenManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final kotlin.Pair<java.lang.Boolean, java.lang.String> validateUserInput() {
        return null;
    }
    
    private final void showValidationErrors(java.lang.String error) {
    }
    
    private final com.sammycode.notesample.models.UserRequest getUserRequest() {
        return null;
    }
    
    private final void bindObservers() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}