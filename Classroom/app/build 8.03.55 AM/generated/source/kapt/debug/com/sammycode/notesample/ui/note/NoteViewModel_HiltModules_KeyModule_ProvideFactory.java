// Generated by Dagger (https://dagger.dev).
package com.sammycode.notesample.ui.note;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NoteViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static NoteViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(NoteViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final NoteViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new NoteViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
