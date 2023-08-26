package com.sammycode.notesample.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0011\u0010\u001b\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001f2\u0006\u0010 \u001a\u00020\rH\u0002J!\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R)\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/sammycode/notesample/repository/NoteRepository;", "", "noteAPI", "Lcom/sammycode/notesample/api/NoteAPI;", "(Lcom/sammycode/notesample/api/NoteAPI;)V", "_notesLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sammycode/notesample/utils/NetworkResult;", "", "Lcom/sammycode/notesample/models/NoteResponse;", "_statusLiveData", "Lkotlin/Pair;", "", "", "notesLiveData", "getNotesLiveData", "()Landroidx/lifecycle/MutableLiveData;", "statusLiveData", "getStatusLiveData", "createNote", "", "noteRequest", "Lcom/sammycode/notesample/models/NoteRequest;", "(Lcom/sammycode/notesample/models/NoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNote", "noteId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleResponse", "response", "Lretrofit2/Response;", "message", "updateNote", "id", "(Ljava/lang/String;Lcom/sammycode/notesample/models/NoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NoteRepository {
    private final com.sammycode.notesample.api.NoteAPI noteAPI = null;
    private final androidx.lifecycle.MutableLiveData<com.sammycode.notesample.utils.NetworkResult<java.util.List<com.sammycode.notesample.models.NoteResponse>>> _notesLiveData = null;
    private final androidx.lifecycle.MutableLiveData<com.sammycode.notesample.utils.NetworkResult<kotlin.Pair<java.lang.Boolean, java.lang.String>>> _statusLiveData = null;
    
    @javax.inject.Inject()
    public NoteRepository(@org.jetbrains.annotations.NotNull()
    com.sammycode.notesample.api.NoteAPI noteAPI) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.sammycode.notesample.utils.NetworkResult<java.util.List<com.sammycode.notesample.models.NoteResponse>>> getNotesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.sammycode.notesample.utils.NetworkResult<kotlin.Pair<java.lang.Boolean, java.lang.String>>> getStatusLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createNote(@org.jetbrains.annotations.NotNull()
    com.sammycode.notesample.models.NoteRequest noteRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateNote(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.sammycode.notesample.models.NoteRequest noteRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull()
    java.lang.String noteId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void handleResponse(retrofit2.Response<com.sammycode.notesample.models.NoteResponse> response, java.lang.String message) {
    }
}