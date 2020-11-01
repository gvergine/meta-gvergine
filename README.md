# meta-gvergine
Yocto layer for my experiments on rpi4

# Ubuntu 20.04 Setup

## Required packages
```apt install build-essential chrpath diffstat gawk libncurses5-dev python3-distutils texinfo``` 

## Use bash instead of dash
```sudo dpkg-reconfigure dash```

## Clone everything
```
git clone -b dunfell git://git.yoctoproject.org/poky.git poky-dunfell

cd poky-dunfell

git clone -b dunfell git://git.openembedded.org/meta-openembedded
git clone -b dunfell https://github.com/meta-qt5/meta-qt5
git clone -b dunfell git://git.yoctoproject.org/meta-raspberrypi
git clone -b dunfell git://git.yoctoproject.org/meta-security.git
git clone -b dunfell https://github.com/gvergine/meta-gvergine

cd ..
```

## Prepare build environment
```
mkdir ~/yocto
source poky-dunfell/oe-init-build-env ~/yocto/build
```
