package com.sammycode.notesample.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/sammycode/notesample/api/AuthInterceptor;", "Lokhttp3/Interceptor;", "()V", "tokenManager", "Lcom/sammycode/notesample/utils/TokenManager;", "getTokenManager", "()Lcom/sammycode/notesample/utils/TokenManager;", "setTokenManager", "(Lcom/sammycode/notesample/utils/TokenManager;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_debug"})
public final class AuthInterceptor implements okhttp3.Interceptor {
    @javax.inject.Inject()
    public com.sammycode.notesample.utils.TokenManager tokenManager;
    
    @javax.inject.Inject()
    public AuthInterceptor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sammycode.notesample.utils.TokenManager getTokenManager() {
        return null;
    }
    
    public final void setTokenManager(@org.jetbrains.annotations.NotNull()
    com.sammycode.notesample.utils.TokenManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
}