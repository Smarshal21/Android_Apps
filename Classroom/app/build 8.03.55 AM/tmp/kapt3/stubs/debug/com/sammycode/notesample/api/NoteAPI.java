package com.sammycode.notesample.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/sammycode/notesample/api/NoteAPI;", "", "createNote", "Lretrofit2/Response;", "Lcom/sammycode/notesample/models/NoteResponse;", "noteRequest", "Lcom/sammycode/notesample/models/NoteRequest;", "(Lcom/sammycode/notesample/models/NoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNote", "noteId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateNote", "(Ljava/lang/String;Lcom/sammycode/notesample/models/NoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NoteAPI {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/note")
    public abstract java.lang.Object createNote(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sammycode.notesample.models.NoteRequest noteRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.sammycode.notesample.models.NoteResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/note")
    public abstract java.lang.Object getNotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.sammycode.notesample.models.NoteResponse>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "/note/{noteId}")
    public abstract java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "noteId")
    java.lang.String noteId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.sammycode.notesample.models.NoteResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "/note/{noteId}")
    public abstract java.lang.Object updateNote(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "noteId")
    java.lang.String noteId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.sammycode.notesample.models.NoteRequest noteRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.sammycode.notesample.models.NoteResponse>> continuation);
}