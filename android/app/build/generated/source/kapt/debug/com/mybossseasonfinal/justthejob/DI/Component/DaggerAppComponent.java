// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.mybossseasonfinal.justthejob.DI.Component;

import android.app.Application;
import com.mybossseasonfinal.justthejob.DI.Module.ApiModule;
import com.mybossseasonfinal.justthejob.DI.Module.ApiModule_ProvideApiServiceFactory;
import com.mybossseasonfinal.justthejob.DI.Module.ApiModule_ProvideOkHttpClientFactory;
import com.mybossseasonfinal.justthejob.DI.Module.ApiModule_ProvideRetrofitFactory;
import com.mybossseasonfinal.justthejob.DI.Module.AppModule;
import com.mybossseasonfinal.justthejob.DI.Module.AppModule_ProvideApplicationFactory;
import com.mybossseasonfinal.justthejob.Services.ApiService;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public final class DaggerAppComponent implements AppComponent {
  private Provider<Application> provideApplicationProvider;

  private Provider<OkHttpClient> provideOkHttpClientProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<ApiService> provideApiServiceProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideApplicationProvider =
        DoubleCheck.provider(AppModule_ProvideApplicationFactory.create(builder.appModule));
    this.provideOkHttpClientProvider =
        DoubleCheck.provider(ApiModule_ProvideOkHttpClientFactory.create(builder.apiModule));
    this.provideRetrofitProvider =
        DoubleCheck.provider(
            ApiModule_ProvideRetrofitFactory.create(
                builder.apiModule, provideOkHttpClientProvider));
    this.provideApiServiceProvider =
        DoubleCheck.provider(
            ApiModule_ProvideApiServiceFactory.create(builder.apiModule, provideRetrofitProvider));
  }

  @Override
  public Application application() {
    return provideApplicationProvider.get();
  }

  @Override
  public ApiService apiService() {
    return provideApiServiceProvider.get();
  }

  public static final class Builder {
    private AppModule appModule;

    private ApiModule apiModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      if (apiModule == null) {
        this.apiModule = new ApiModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder apiModule(ApiModule apiModule) {
      this.apiModule = Preconditions.checkNotNull(apiModule);
      return this;
    }
  }
}