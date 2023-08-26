package com.sammycode.notesample.ui.note;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000fJ\u0006\u0010\u0017\u001a\u00020\u0012J\u0016\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR)\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lcom/sammycode/notesample/ui/note/NoteViewModel;", "Landroidx/lifecycle/ViewModel;", "noteRepository", "Lcom/sammycode/notesample/repository/NoteRepository;", "(Lcom/sammycode/notesample/repository/NoteRepository;)V", "notesLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/sammycode/notesample/utils/NetworkResult;", "", "Lcom/sammycode/notesample/models/NoteResponse;", "getNotesLiveData", "()Landroidx/lifecycle/MutableLiveData;", "statusLiveData", "Lkotlin/Pair;", "", "", "getStatusLiveData", "createNote", "", "noteRequest", "Lcom/sammycode/notesample/models/NoteRequest;", "deleteNote", "noteId", "getAllNotes", "updateNote", "id", "app_debug"})
public final class NoteViewModel extends androidx.lifecycle.ViewModel {
    private final com.sammycode.notesample.repository.NoteRepository noteRepository = null;
    
    @javax.inject.Inject()
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    com.sammycode.notesample.repository.NoteRepository noteRepository) {
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
    
    public final void createNote(@org.jetbrains.annotations.NotNull()
    com.sammycode.notesample.models.NoteRequest noteRequest) {
    }
    
    public final void getAllNotes() {
    }
    
    public final void updateNote(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.sammycode.notesample.models.NoteRequest noteRequest) {
    }
    
    public final void deleteNote(@org.jetbrains.annotations.NotNull()
    java.lang.String noteId) {
    }
}