# pulls necessary zephyr SDK built for macOS aarch64

set -e

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

if [[ -z "${REPO_ROOT}" ]]; then
    echo "env var 'REPO_ROOT' not set. please set it to the folder containing kotlin checkout"
    exit 1
fi

DOWNLOAD_DIR=$REPO_ROOT/build/download

if [ -d $DOWNLOAD_DIR ]; then
    rm -rf $DOWNLOAD_DIR
fi

mkdir -p $DOWNLOAD_DIR
cd $DOWNLOAD_DIR
wget https://github.com/AfflatusX/sdk-ng-atomic/releases/download/macos_qemu/macos_qemu.tar.gz

QEMU_SDK_DIR="$REPO_ROOT/build/sdk/qemu"

if [ ! -d $QEMU_SDK_DIR ]; then
    mkdir -p $QEMU_SDK_DIR
fi

tar xf macos_qemu.tar.gz -C $QEMU_SDK_DIR