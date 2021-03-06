// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.mybossseasonfinal.justthejob.DI.Component;

import com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationActivity;
import com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationActivity_MembersInjector;
import com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationContract;
import com.mybossseasonfinal.justthejob.CompanyRegistrationActivity.CompanyRegistrationPresenter;
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule;
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule_ProvideCompanyRegistrationContractViewFactory;
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule_ProvideMainContractViewFactory;
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule_ProvideMatchingByEntrySheetCompleteViewFactory;
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule_ProvideMatchingRequestCompleteViewFactory;
import com.mybossseasonfinal.justthejob.DI.Module.ActivityModule_ProvideWorkerInfomationDetailContractViewFactory;
import com.mybossseasonfinal.justthejob.MainActivity.MainActivity;
import com.mybossseasonfinal.justthejob.MainActivity.MainActivity_MembersInjector;
import com.mybossseasonfinal.justthejob.MainActivity.MainContract;
import com.mybossseasonfinal.justthejob.MainActivity.MainPresenter;
import com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity.MatchingByEntrySheetCompleteActivity;
import com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity.MatchingByEntrySheetCompleteActivity_MembersInjector;
import com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity.MatchingByEntrySheetCompleteContract;
import com.mybossseasonfinal.justthejob.MatchingByEntrySheetCompleteActivity.MatchingByEntrySheetCompletePresenter;
import com.mybossseasonfinal.justthejob.MatchingRequestCompleteActivity.MatchingRequestCompleteActivity;
import com.mybossseasonfinal.justthejob.MatchingRequestCompleteActivity.MatchingRequestCompleteActivity_MembersInjector;
import com.mybossseasonfinal.justthejob.MatchingRequestCompleteActivity.MatchingRequestCompleteContract;
import com.mybossseasonfinal.justthejob.MatchingRequestCompleteActivity.MatchingRequestCompletePresenter;
import com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailActivity;
import com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailActivity_MembersInjector;
import com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailContract;
import com.mybossseasonfinal.justthejob.WorkerDetailInfomationActivity.WorkerInfomationDetailPresenter;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerActivityComponent implements ActivityComponent {
  private AppComponent appComponent;

  private Provider<MainContract.View> provideMainContractViewProvider;

  private Provider<CompanyRegistrationContract.View> provideCompanyRegistrationContractViewProvider;

  private Provider<WorkerInfomationDetailContract.View>
      provideWorkerInfomationDetailContractViewProvider;

  private Provider<MatchingRequestCompleteContract.View> provideMatchingRequestCompleteViewProvider;

  private Provider<MatchingByEntrySheetCompleteContract.View>
      provideMatchingByEntrySheetCompleteViewProvider;

  private DaggerActivityComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  private MainPresenter getMainPresenter() {
    return new MainPresenter(
        Preconditions.checkNotNull(
            appComponent.apiService(), "Cannot return null from a non-@Nullable component method"),
        provideMainContractViewProvider.get());
  }

  private CompanyRegistrationPresenter getCompanyRegistrationPresenter() {
    return new CompanyRegistrationPresenter(
        Preconditions.checkNotNull(
            appComponent.apiService(), "Cannot return null from a non-@Nullable component method"),
        provideCompanyRegistrationContractViewProvider.get());
  }

  private WorkerInfomationDetailPresenter getWorkerInfomationDetailPresenter() {
    return new WorkerInfomationDetailPresenter(
        Preconditions.checkNotNull(
            appComponent.apiService(), "Cannot return null from a non-@Nullable component method"),
        provideWorkerInfomationDetailContractViewProvider.get());
  }

  private MatchingRequestCompletePresenter getMatchingRequestCompletePresenter() {
    return new MatchingRequestCompletePresenter(
        Preconditions.checkNotNull(
            appComponent.apiService(), "Cannot return null from a non-@Nullable component method"),
        provideMatchingRequestCompleteViewProvider.get());
  }

  private MatchingByEntrySheetCompletePresenter getMatchingByEntrySheetCompletePresenter() {
    return new MatchingByEntrySheetCompletePresenter(
        Preconditions.checkNotNull(
            appComponent.apiService(), "Cannot return null from a non-@Nullable component method"),
        provideMatchingByEntrySheetCompleteViewProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.appComponent = builder.appComponent;
    this.provideMainContractViewProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMainContractViewFactory.create(builder.activityModule));
    this.provideCompanyRegistrationContractViewProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideCompanyRegistrationContractViewFactory.create(
                builder.activityModule));
    this.provideWorkerInfomationDetailContractViewProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideWorkerInfomationDetailContractViewFactory.create(
                builder.activityModule));
    this.provideMatchingRequestCompleteViewProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMatchingRequestCompleteViewFactory.create(
                builder.activityModule));
    this.provideMatchingByEntrySheetCompleteViewProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMatchingByEntrySheetCompleteViewFactory.create(
                builder.activityModule));
  }

  @Override
  public void inject(MainActivity mainActivity) {
    injectMainActivity(mainActivity);
  }

  @Override
  public void inject(CompanyRegistrationActivity companyRegistrationActivity) {
    injectCompanyRegistrationActivity(companyRegistrationActivity);
  }

  @Override
  public void inject(WorkerInfomationDetailActivity workerInfomationDetailActivity) {
    injectWorkerInfomationDetailActivity(workerInfomationDetailActivity);
  }

  @Override
  public void inject(MatchingRequestCompleteActivity matchingRequestCompleteActivity) {
    injectMatchingRequestCompleteActivity(matchingRequestCompleteActivity);
  }

  @Override
  public void inject(MatchingByEntrySheetCompleteActivity matchingByEntrySheetCompleteActivity) {
    injectMatchingByEntrySheetCompleteActivity(matchingByEntrySheetCompleteActivity);
  }

  private MainActivity injectMainActivity(MainActivity instance) {
    MainActivity_MembersInjector.injectMainPresenter(instance, getMainPresenter());
    return instance;
  }

  private CompanyRegistrationActivity injectCompanyRegistrationActivity(
      CompanyRegistrationActivity instance) {
    CompanyRegistrationActivity_MembersInjector.injectCompanyRegistrationPresenter(
        instance, getCompanyRegistrationPresenter());
    return instance;
  }

  private WorkerInfomationDetailActivity injectWorkerInfomationDetailActivity(
      WorkerInfomationDetailActivity instance) {
    WorkerInfomationDetailActivity_MembersInjector.injectWorkerInfomationDetailPresenter(
        instance, getWorkerInfomationDetailPresenter());
    return instance;
  }

  private MatchingRequestCompleteActivity injectMatchingRequestCompleteActivity(
      MatchingRequestCompleteActivity instance) {
    MatchingRequestCompleteActivity_MembersInjector.injectMatchingRequestCompletePresenter(
        instance, getMatchingRequestCompletePresenter());
    return instance;
  }

  private MatchingByEntrySheetCompleteActivity injectMatchingByEntrySheetCompleteActivity(
      MatchingByEntrySheetCompleteActivity instance) {
    MatchingByEntrySheetCompleteActivity_MembersInjector
        .injectMatchingByEntrySheetCompletePresenter(
            instance, getMatchingByEntrySheetCompletePresenter());
    return instance;
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private AppComponent appComponent;

    private Builder() {}

    public ActivityComponent build() {
      if (activityModule == null) {
        throw new IllegalStateException(ActivityModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponent(this);
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}
