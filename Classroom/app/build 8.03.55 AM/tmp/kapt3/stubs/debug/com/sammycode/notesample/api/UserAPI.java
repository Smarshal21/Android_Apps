package com.sammycode.notesample.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/sammycode/notesample/api/UserAPI;", "", "signin", "Lretrofit2/Response;", "Lcom/sammycode/notesample/models/UserResponse;", "userRequest", "Lcom/sammycode/notesample/models/UserRequest;", "(Lcom/sammycode/notesample/models/UserRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signup", "app_debug"})
public abstract interface UserAPI {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/users/signup")
    public abstract java.lang.Object signup(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sammycode.notesample.models.UserRequest userRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.sammycode.notesample.models.UserResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/users/signin")
    public abstract java.lang.Object signin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sammycode.notesample.models.UserRequest userRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.sammycode.notesample.models.UserResponse>> continuation);
}