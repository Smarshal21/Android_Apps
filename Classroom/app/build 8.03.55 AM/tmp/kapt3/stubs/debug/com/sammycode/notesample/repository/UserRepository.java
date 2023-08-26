package com.sammycode.notesample.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0002J\u0019\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/sammycode/notesample/repository/UserRepository;", "", "userAPI", "Lcom/sammycode/notesample/api/UserAPI;", "(Lcom/sammycode/notesample/api/UserAPI;)V", "_userResponseLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sammycode/notesample/utils/NetworkResult;", "Lcom/sammycode/notesample/models/UserResponse;", "userResponseLiveData", "Landroidx/lifecycle/LiveData;", "getUserResponseLiveData", "()Landroidx/lifecycle/LiveData;", "handleResponse", "", "response", "Lretrofit2/Response;", "loginUser", "userRequest", "Lcom/sammycode/notesample/models/UserRequest;", "(Lcom/sammycode/notesample/models/UserRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "app_debug"})
public final class UserRepository {
    private final com.sammycode.notesample.api.UserAPI userAPI = null;
    private final androidx.lifecycle.MutableLiveData<com.sammycode.notesample.utils.NetworkResult<com.sammycode.notesample.models.UserResponse>> _userResponseLiveData = null;
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.sammycode.notesample.api.UserAPI userAPI) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.sammycode.notesample.utils.NetworkResult<com.sammycode.notesample.models.UserResponse>> getUserResponseLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registerUser(@org.jetbrains.annotations.NotNull()
    com.sammycode.notesample.models.UserRequest userRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loginUser(@org.jetbrains.annotations.NotNull()
    com.sammycode.notesample.models.UserRequest userRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void handleResponse(retrofit2.Response<com.sammycode.notesample.models.UserResponse> response) {
    }
}