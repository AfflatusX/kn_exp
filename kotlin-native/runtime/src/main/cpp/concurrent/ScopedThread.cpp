/*
 * Copyright 2010-2024 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

#include "ScopedThread.hpp"

#include <cstring>
#include <pthread.h>
#include <type_traits>

#include "Logging.hpp"

using namespace kotlin;

void internal::setCurrentThreadName(std::string_view name) noexcept {
#if KONAN_MACOSX || KONAN_IOS || KONAN_WATCHOS || KONAN_TVOS
    static_assert(std::is_invocable_r_v<void, decltype(pthread_setname_np), const char*>, "Invalid pthread_setname_np signature");
    pthread_setname_np(name.data());
#elif KONAN_ZEPHYR
    RuntimeLogWarning({logging::Tag::kRT}, "ZEPHYR does not support setting thread name");
#else
    static_assert(std::is_invocable_r_v<int, decltype(pthread_setname_np), pthread_t, const char*>, "Invalid pthread_setname_np signature");
    // TODO: On Linux the maximum thread name is 16 characters. Handle automatically?
    int result = pthread_setname_np(pthread_self(), name.data());
    if (result != 0) {
        RuntimeLogWarning({logging::Tag::kRT}, "Failed to set thread name: %s", std::strerror(result));
    }
#endif
}
