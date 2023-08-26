package com.sammycode.notesample.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/sammycode/notesample/di/NetworkModule;", "", "()V", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "interceptor", "Lcom/sammycode/notesample/api/AuthInterceptor;", "providesNoteAPI", "Lcom/sammycode/notesample/api/NoteAPI;", "retrofitBuilder", "Lretrofit2/Retrofit$Builder;", "okHttpClient", "providesRetrofit", "providesUserAPI", "Lcom/sammycode/notesample/api/UserAPI;", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit.Builder providesRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    com.sammycode.notesample.api.AuthInterceptor interceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.sammycode.notesample.api.UserAPI providesUserAPI(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder retrofitBuilder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.sammycode.notesample.api.NoteAPI providesNoteAPI(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder retrofitBuilder, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
}