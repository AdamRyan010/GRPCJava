/*
 * Copyright 2021 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.grpc.xds;

import static com.google.common.base.Preconditions.checkNotNull;

// TODO(zdapeng): Unify with ClientXdsClient.StructOrError, or just have parseFilterConfig() throw
//     certain types of Exception.
final class ConfigOrError<T> {

  /**
   * Returns a {@link ConfigOrError} for the successfully converted data object.
   */
  static <T> ConfigOrError<T> fromConfig(T config) {
    return new ConfigOrError<>(config);
  }

  /**
   * Returns a {@link ConfigOrError} for the failure to convert the data object.
   */
  static <T> ConfigOrError<T> fromError(String errorDetail) {
    return new ConfigOrError<>(errorDetail);
  }

  final String errorDetail;
  final T config;

  private ConfigOrError(T config) {
    this.config = checkNotNull(config, "config");
    this.errorDetail = null;
  }

  private ConfigOrError(String errorDetail) {
    this.config = null;
    this.errorDetail = checkNotNull(errorDetail, "errorDetail");
  }
}
