// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.mybossseasonfinal.justthejob.MainActivity.MainFragment.EntrySheetFragment;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class EntrySheetFragment_MembersInjector
    implements MembersInjector<EntrySheetFragment> {
  private final Provider<EntrySheetPresenter> entrySheetPresenterProvider;

  public EntrySheetFragment_MembersInjector(
      Provider<EntrySheetPresenter> entrySheetPresenterProvider) {
    this.entrySheetPresenterProvider = entrySheetPresenterProvider;
  }

  public static MembersInjector<EntrySheetFragment> create(
      Provider<EntrySheetPresenter> entrySheetPresenterProvider) {
    return new EntrySheetFragment_MembersInjector(entrySheetPresenterProvider);
  }

  @Override
  public void injectMembers(EntrySheetFragment instance) {
    injectEntrySheetPresenter(instance, entrySheetPresenterProvider.get());
  }

  public static void injectEntrySheetPresenter(
      EntrySheetFragment instance, EntrySheetPresenter entrySheetPresenter) {
    instance.entrySheetPresenter = entrySheetPresenter;
  }
}
