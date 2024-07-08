Use this document if you only checked out Kotlin sub repo. If you have the master repo checked out, simply run the `build_kotlin_compiler` script from there.

# Checkout Steps
1. create an empty parent folder
2. cd into the folder from step 1
3. `git clone https://github.com/AfflatusX/kn_exp.git kotlin`

# Setup Steps
1. Set env var `REPO_ROOT` pointing to the parent of your kotlin checkout. For example, if the repo is checked out at `/a/b/kotlin` you would run `export REPO_ROOT=/a/b`. NOTE - all the steps listed in this document requires this env var. If you opened a new terminal, run this step again.
2. Run `./scripts/install_sdk.sh`. This pulls pre-built zephyr SDK for macos aarch64, which is needed to build kotlin for zephyr. It's downloaded and expanded to $REPO_ROOT/build/sdk/qemu/output

# Build Steps
1. cd into kotlin checkout
2. create file called `local.properties` under kotlin checkout
3. add `kotlin.native.enabled=true` to `local.properties` to enable KN
4. run `./gradlew publish`, it will take a while
5. now add `bootstrap.local=true` to `local.properties`, which will tell `gradle` to use the compiler we just built instead.
6. `rm kotlin-native/runtime/build/nativeStdlib/default/manifest`
7. run `./gradlew :kotlin-native:zephyr_qemucrossDist`, which will build the `zephyr_qemucrossDist` related binaries.

# Repro Steps
1. create build folder with `mkdir -p $REPO_ROOT/build/firmware/qemu`
2. build the kotlin lib code with `$REPO_ROOT/kotlin/kotlin-native/dist/bin/kotlinc-native $REPO_ROOT/kotlin/zephyr/src/nativeMain/kotlin/lib.kt -target zephyr_qemu -produce static -Xtemporary-files-dir=$REPO_ROOT/build/firmware/qemu -Xsave-llvm-ir-directory=$REPO_ROOT/build/firmware/qemu -module-name libkn`
3. dis-assemble the bc file with `~/.konan/dependencies/apple-llvm-20200714-macos-x64-1/bin/llvm-dis $REPO_ROOT/build/firmware/qemu/out.bc`
4. Now you can inspect `out.ll` under `$REPO_ROOT/build/firmware/qemu`
5. search for `kfun:example#exampleRun()` you will see that it got stripped out (showing only trap call)