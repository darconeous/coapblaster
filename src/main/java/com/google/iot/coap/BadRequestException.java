/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.iot.coap;

/** @hide TODO: Consider removing BadRequestException. */
@SuppressWarnings("unused")
public class BadRequestException extends ResponseException {
    public BadRequestException() {}

    public BadRequestException(String reason) {
        super(reason);
    }

    public BadRequestException(String reason, Throwable t) {
        super(reason, t);
    }

    public BadRequestException(Throwable t) {
        super(t);
    }

    @Override
    public int getCode() {
        return Code.RESPONSE_BAD_REQUEST;
    }
}
