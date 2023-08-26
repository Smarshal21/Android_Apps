package com.sammycode.notesample.ui.login;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ2\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/sammycode/notesample/ui/login/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/sammycode/notesample/repository/UserRepository;", "(Lcom/sammycode/notesample/repository/UserRepository;)V", "userResponseLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/sammycode/notesample/utils/NetworkResult;", "Lcom/sammycode/notesample/models/UserResponse;", "getUserResponseLiveData", "()Landroidx/lifecycle/LiveData;", "loginUser", "", "userRequest", "Lcom/sammycode/notesample/models/UserRequest;", "registerUser", "validateCredentials", "Lkotlin/Pair;", "", "", "emailAddress", "userName", "password", "isLogin", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    private final com.sammycode.notesample.repository.UserRepository userRepository = null;
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.sammycode.notesample.repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.sammycode.notesample.utils.NetworkResult<com.sammycode.notesample.models.UserResponse>> getUserResponseLiveData() {
        return null;
    }
    
    public final void registerUser(@org.jetbrains.annotations.NotNull()
    com.sammycode.notesample.models.UserRequest userRequest) {
    }
    
    public final void loginUser(@org.jetbrains.annotations.NotNull()
    com.sammycode.notesample.models.UserRequest userRequest) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.Boolean, java.lang.String> validateCredentials(@org.jetbrains.annotations.NotNull()
    java.lang.String emailAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password, boolean isLogin) {
        return null;
    }
}